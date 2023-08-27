package com.omarismayilov.busybag.data.repository

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.StorageReference
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.data.remote.api.ProductApiService
import com.omarismayilov.busybag.data.remote.dto.ProductsDTO
import com.omarismayilov.busybag.domain.mapper.Mapper.toProductUiList
import com.omarismayilov.busybag.domain.model.CategoryUiModel
import com.omarismayilov.busybag.domain.model.OfferUiModel
import com.omarismayilov.busybag.domain.model.ProductUiModel
import com.omarismayilov.busybag.domain.repository.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    val firestore: FirebaseFirestore,
    val storage: StorageReference,
    val productApiService: ProductApiService,
) : ProductRepository {

    override fun getOffers(): Flow<Resource<List<OfferUiModel>>> = flow {
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
                        thumbnailUrl = storage.child(it.thumbnailUrl).downloadUrl.await().toString()

                    )
                )
            }
        }
        emit(Resource.Success(offersList))
    }
        .flowOn(Dispatchers.IO)
        .catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override fun getCategories(): Flow<Resource<List<CategoryUiModel>>> = flow {
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
    }
        .flowOn(Dispatchers.IO)
        .catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override fun getProductByCategory(category: String): Flow<Resource<ProductsDTO>> = flow {
        emit(Resource.Loading)
        val response = productApiService.getProductsByCategory(category)
        emit(Resource.Success(response))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override fun getProducts(): Flow<Resource<ProductsDTO>> = flow {
        emit(Resource.Loading)
        val response = productApiService.getProducts()
        emit(Resource.Success(response))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }


}