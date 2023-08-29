package com.omarismayilov.busybag.presentation.ui.offer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.omarismayilov.busybag.R
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentOfferProductBinding
import com.omarismayilov.busybag.domain.model.OfferUiModel
import com.omarismayilov.busybag.presentation.ui.home.HomeUiState
import com.omarismayilov.busybag.presentation.ui.home.adapter.PopularProductAdapter
import com.omarismayilov.busybag.presentation.ui.offer.adapter.OfferProductAdapter
import com.omarismayilov.movaapp.common.utils.Extensions.gone
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.movaapp.common.utils.Extensions.visible
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OfferProductFragment :
    BaseFragment<FragmentOfferProductBinding>(FragmentOfferProductBinding::inflate) {

    private val args: OfferProductFragmentArgs by navArgs()
    private val viewModel: OfferViewModel by viewModels()
    private val offerProductAdapter = OfferProductAdapter()

    override fun observeEvents() {
        with(viewModel) {
            offerState.observe(viewLifecycleOwner) { handleState(it) }
        }
    }

    override fun onCreateFinish() {
        setAdapter()
        binding.offer = args.offer
        viewModel.getProducts(args.offer.discount)
    }

    private fun setAdapter() {
        binding.rvProduct.adapter = offerProductAdapter
    }

    private fun handleState(it: OffersUiState) {
        with(binding) {
            when (it) {
                is OffersUiState.SuccessOfferProductData -> {
                    if (it.list.isEmpty()) {
                        lyError.visible()
                        rvProduct.gone()
                    } else {
                        lyError.gone()
                        rvProduct.visible()
                    }
                    offerProductAdapter.differ.submitList(it.list)
                    loading.gone()
                }

                is OffersUiState.Error -> {
                    loading.gone()
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                }

                is OffersUiState.Loading -> {
                    loading.visible()
                }
            }
        }
    }

    override fun setupListeners() {
        with(binding){
            ibBack.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }


}