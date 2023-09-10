package com.omarismayilov.busybag.presentation.ui.home

import android.content.ContentValues.TAG
import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentHomeBinding
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.domain.mapper.Mapper.toProductUiList
import com.omarismayilov.busybag.presentation.ui.auth.AuthViewModel
import com.omarismayilov.busybag.presentation.ui.explore.ExploreFragmentDirections
import com.omarismayilov.busybag.presentation.ui.home.adapter.CategoryAdapter
import com.omarismayilov.busybag.presentation.ui.home.adapter.OfferPagerAdapter
import com.omarismayilov.busybag.presentation.ui.home.adapter.PopularProductAdapter
import com.omarismayilov.busybag.presentation.ui.home.adapter.RecommendAdapter
import com.omarismayilov.movaapp.common.utils.Extensions.alpha
import com.omarismayilov.movaapp.common.utils.Extensions.gone
import com.omarismayilov.movaapp.common.utils.Extensions.goneEach
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.movaapp.common.utils.Extensions.visible
import com.omarismayilov.movaapp.common.utils.Extensions.visibleEach
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private val viewModel: HomeViewModel by viewModels()
    private val offerAdapter = OfferPagerAdapter()
    private val categoryAdapter = CategoryAdapter()
    private val popularProductAdapter = PopularProductAdapter()
    private val recommendAdapter = RecommendAdapter()


    override fun observeEvents() {
        with(viewModel) {
            homeState.observe(viewLifecycleOwner) { handleState(it) }
        }
    }

    override fun onCreateFinish() {
        setAdapters()
    }

    override fun setupListeners() {
        with(binding) {
            ibFav.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToFavouriteFragment())
            }
            tvCategory.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToExploreFragment())
            }
            offerAdapter.onClick = {
                findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToOfferProductFragment(
                        it
                    )
                )
            }
            recommendAdapter.onClick = {
                findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToDetailFragment3(
                        it
                    )
                )
            }
            popularProductAdapter.onClick = {
                findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToDetailFragment3(
                        it
                    )
                )
            }
            categoryAdapter.onClick = {
                findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToProductListFragment2(
                        it
                    )
                )
            }

        }

    }


    private fun handleState(it: AppUiState) {
        with(binding) {
            when (it) {
                is AppUiState.SuccessOfferData -> {
                    lyMain.alpha(1f)
                    offerAdapter.differ.submitList(it.list)
                    loading.gone()
                }

                is AppUiState.SuccessCategoryData -> {
                    categoryAdapter.differ.submitList(it.list)
                    loading2.gone()
                }

                is AppUiState.SuccessPopularData -> {
                    popularProductAdapter.differ.submitList(it.list)
                    loading3.gone()
                }

                is AppUiState.SuccessRecommendData -> {
                    recommendAdapter.differ.submitList(it.list)
                    loading4.gone()
                }

                is AppUiState.Error -> {
                    lyMain.alpha(1f)
                    listOf(loading, loading2, loading3, loading4).goneEach()
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                }

                is AppUiState.Loading -> {
                    lyMain.alpha(0.6f)
                    listOf(loading, loading2, loading3, loading4).visibleEach()
                }

                else -> {}
            }
        }

    }

    private fun setAdapters() {
        with(binding) {
            viewPager2.adapter = offerAdapter
            rvCategory.adapter = categoryAdapter
            rvPopular.adapter = popularProductAdapter
            rvRecommend.adapter = recommendAdapter
            springDotsIndicator.attachTo(viewPager2)
        }

    }


}