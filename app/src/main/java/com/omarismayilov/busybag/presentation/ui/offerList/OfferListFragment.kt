package com.omarismayilov.busybag.presentation.ui.offerList

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentOfferListBinding
import com.omarismayilov.busybag.presentation.ui.home.HomeUiState
import com.omarismayilov.busybag.presentation.ui.home.HomeViewModel
import com.omarismayilov.busybag.presentation.ui.home.adapter.OfferPagerAdapter
import com.omarismayilov.busybag.presentation.ui.offer.OfferViewModel
import com.omarismayilov.movaapp.common.utils.Extensions.gone
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.movaapp.common.utils.Extensions.visible
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OfferListFragment :
    BaseFragment<FragmentOfferListBinding>(FragmentOfferListBinding::inflate) {

    private val viewModel: HomeViewModel by viewModels()
    private val offerAdapter = OfferPagerAdapter()

    override fun observeEvents() {
        viewModel.homeState.observe(viewLifecycleOwner) {
            handleState(it)
        }
    }

    private fun handleState(it: HomeUiState) {
        with(binding) {
            when (it) {
                is HomeUiState.SuccessOfferData -> {
                    offerAdapter.differ.submitList(it.list)
                    loadingView.gone()
                }
                is HomeUiState.SuccessRecommendData -> {}
                is HomeUiState.SuccessPopularData -> {}
                is HomeUiState.SuccessCategoryData -> {}
                is HomeUiState.Error -> {
                    loadingView.gone()
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                }
                is HomeUiState.Loading -> { loadingView.visible() }
            }
        }
    }

    override fun onCreateFinish() {
        setAdapters()
    }

    private fun setAdapters() {
        with(binding){
            offerPager.adapter = offerAdapter
            dotsIndicator.attachTo(offerPager)
        }
    }

    override fun setupListeners() {
        offerAdapter.onClick = {
            findNavController().navigate(
                OfferListFragmentDirections.actionOfferListFragmentToOfferProductFragment(
                    it
                )
            )
        }
    }

}