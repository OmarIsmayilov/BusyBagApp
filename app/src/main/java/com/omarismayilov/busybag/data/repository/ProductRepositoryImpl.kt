package com.omarismayilov.busybag.data.repository


import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.StorageReference
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.data.local.cart.CartDAO
import com.omarismayilov.busybag.data.local.cart.CartDTO
import com.omarismayilov.busybag.data.local.favorite.FavoriteDAO
import com.omarismayilov.busybag.data.local.favorite.FavoriteDTO
import com.omarismayilov.busybag.data.remote.api.ProductApiService
import com.omarismayilov.busybag.data.remote.dto.ProductDTO
import com.omarismayilov.busybag.data.remote.dto.ProductsDTO
import com.omarismayilov.busybag.domain.model.CategoryUiModel
import com.omarismayilov.busybag.domain.model.OfferUiModel
import com.omarismayilov.busybag.domain.repository.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val storage: StorageReference,
    private val productApiService: ProductApiService,
    private val favoriteDAO: FavoriteDAO,
    private val cartDAO: CartDAO,
) : ProductRepository {

    override suspend fun getOffers(): Flow<Resource<List<OfferUiModel>>> = flow {
        emit(Resource.Loading)
        val offersList = mutableListOf<OfferUiModel>()
        val offersSnapshot = firestore.collection("offers").get().await()
        for (documentSnapshot in offersSnapshot.documents) {
            val offerUiModel = documentSnapshot.toObject(OfferUiModel::class.java)
            offerUiModel?.let {
                offersList.add(
                    OfferUiModel(
                        id = it.id,
                        title = it.title,
                        discount = it.discount,
                        thumbnailUrl = storage.child(it.thumbnailUrl).downloadUrl.await()
                            .toString(),
                        expirationDate = it.expirationDate
                    )
                )
            }
        }
        emit(Resource.Success(offersList))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override suspend fun getCategories(): Flow<Resource<List<CategoryUiModel>>> = flow {
        emit(Resource.Loading)
        val categoryList = mutableListOf<CategoryUiModel>()
        val categorySnapshot = firestore.collection("categories").get().await()
        for (documentSnapshot in categorySnapshot.documents) {
            val categoryUiModel = documentSnapshot.toObject(CategoryUiModel::class.java)
            categoryUiModel?.let {
                categoryList.add(
                    CategoryUiModel(
                        id = it.id,
                        slug = it.slug,
                        name = it.name,
                        icon = storage.child(it.icon).downloadUrl.await().toString()
                    )
                )
            }
        }
        emit(Resource.Success(categoryList))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override suspend fun getProductByCategory(category: String): Flow<Resource<ProductsDTO>> =
        flow {
            emit(Resource.Loading)
            val response = productApiService.getProductsByCategory(category)
            emit(Resource.Success(response))
        }.catch {
            emit(Resource.Error(it.localizedMessage ?: "Error 404"))
        }

    override suspend fun getProducts(): Flow<Resource<ProductsDTO>> = flow {
        emit(Resource.Loading)
        val response = productApiService.getProducts()
        emit(Resource.Success(response))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override suspend fun getProduct(id: Int): Flow<Resource<ProductDTO>> = flow {
        emit(Resource.Loading)
        val response = productApiService.getProduct(id)
        emit(Resource.Success(response))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override suspend fun getSearch(query: String): Flow<Resource<ProductsDTO>> = flow {
        emit(Resource.Loading)
        val response = productApiService.getSearch(query)
        emit(Resource.Success(response))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override suspend fun addFav(product: FavoriteDTO) {
        favoriteDAO.addFav(product)
    }

    override suspend fun deleteFav(product: FavoriteDTO) {
        favoriteDAO.deleteFav(product)
    }


    override suspend fun getFav(): Flow<Resource<List<FavoriteDTO>>> = flow {
        emit(Resource.Loading)
        val response = favoriteDAO.getFav()
        emit(Resource.Success(response))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override suspend fun isProductFavorite(id: Int): Flow<Boolean> = flow {
        val response = favoriteDAO.isProductFavorite(id)
        emit(response)
    }

    override suspend fun addCart(product: CartDTO) {
        cartDAO.addCart(product)
    }

    override suspend fun deleteCart(product: CartDTO) {
        cartDAO.deleteCart(product)
    }

    override suspend fun getCart(): Flow<Resource<List<CartDTO>>> = flow {
        emit(Resource.Loading)
        emit(Resource.Success(cartDAO.getCart()))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }


}
