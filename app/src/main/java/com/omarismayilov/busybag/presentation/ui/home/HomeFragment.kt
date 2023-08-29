package com.omarismayilov.busybag.presentation.ui.home

import android.content.ContentValues.TAG
import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentHomeBinding
import com.omarismayilov.busybag.domain.mapper.Mapper.toProductUiList
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
        with(binding){
            offerAdapter.onClick = {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToOfferProductFragment(it))
            }
            ibFav.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToFavouriteFragment())
            }
        }

    }


    private fun handleState(it: HomeUiState) {
        with(binding) {
            when (it) {
                is HomeUiState.SuccessOfferData -> {
                    lyMain.alpha(1f)
                    offerAdapter.differ.submitList(it.list)
                    loading.gone()
                }

                is HomeUiState.SuccessCategoryData -> {
                    categoryAdapter.differ.submitList(it.list)
                    loading2.gone()
                }

                is HomeUiState.SuccessPopularData -> {
                    popularProductAdapter.differ.submitList(it.list)
                    loading3.gone()
                }

                is HomeUiState.SuccessRecommendData -> {
                    recommendAdapter.differ.submitList(it.list)
                    loading4.gone()
                }

                is HomeUiState.Error -> {
                    lyMain.alpha(1f)
                    listOf(loading,loading2,loading3,loading4).goneEach()
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                }

                is HomeUiState.Loading -> {
                    lyMain.alpha(0.6f)
                    listOf(loading,loading2,loading3,loading4).visibleEach()
                }
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