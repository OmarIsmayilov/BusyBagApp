package com.omarismayilov.busybag.presentation.ui.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentDetailBinding
import com.omarismayilov.busybag.presentation.ui.auth.AuthViewModel
import com.omarismayilov.busybag.presentation.ui.detail.adapter.ImageAdapter
import com.omarismayilov.movaapp.common.utils.Extensions.alpha
import com.omarismayilov.movaapp.common.utils.Extensions.gone
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.movaapp.common.utils.Extensions.visible
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment() : BaseFragment<FragmentDetailBinding>(FragmentDetailBinding::inflate) {

    private val imageAdapter = ImageAdapter()
    private val args: DetailFragmentArgs by navArgs()
    private val viewModel: DetailViewModel by viewModels()

    override fun observeEvents() {
        viewModel.detailState.observe(viewLifecycleOwner) {
            handleState(it)
        }
    }

    private fun handleState(it: DetailUiState) {
        with(binding) {
            when (it) {
                is DetailUiState.SuccessProductData -> {
                    lyMain.alpha(1f)
                    loadingView.gone()
                    product = it.data
                    imageAdapter.differ.submitList(it.data.images)
                }

                is DetailUiState.Error -> {
                    lyMain.alpha(1f)
                    loadingView.gone()
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                }

                is DetailUiState.Loading -> {
                    lyMain.alpha(0.6f)
                    loadingView.visible()
                }
            }
        }

    }

    override fun onCreateFinish() {
        setAdapter()
        viewModel.getProduct(args.id)
    }

    private fun setAdapter() {
        with(binding) {
            vpImage.adapter = imageAdapter
            springDotsIndicator.attachTo(vpImage)
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