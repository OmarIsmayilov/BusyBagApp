package com.omarismayilov.busybag.presentation.ui.offer

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentOfferProductBinding
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.presentation.ui.offer.adapter.ProductAdapter
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
    private val productAdapter = ProductAdapter()

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
        binding.rvProduct.adapter = productAdapter
    }

    private fun handleState(it: AppUiState) {
        with(binding) {
            when (it) {
                is AppUiState.SuccessOfferProductData -> {
                    if (it.list.isEmpty()) {
                        lyError.visible()
                        rvProduct.gone()
                    } else {
                        lyError.gone()
                        rvProduct.visible()
                    }
                    productAdapter.differ.submitList(it.list)
                    loading.gone()
                }

                is AppUiState.Error -> {
                    loading.gone()
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                }

                is AppUiState.Loading -> {
                    loading.visible()
                }

                else -> {}
            }
        }
    }

    override fun setupListeners() {
        with(binding) {
            ibBack.setOnClickListener {
                findNavController().popBackStack()
            }
            productAdapter.onClick = {
                findNavController().navigate(
                    OfferProductFragmentDirections.actionOfferProductFragmentToDetailFragment3(
                        it
                    )
                )
            }
        }
    }


}