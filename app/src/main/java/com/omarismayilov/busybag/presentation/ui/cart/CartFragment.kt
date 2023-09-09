package com.omarismayilov.busybag.presentation.ui.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.androchef.happytimer.utils.extensions.gone
import com.omarismayilov.busybag.R
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentCartBinding
import com.omarismayilov.busybag.presentation.ui.cart.adapter.CartAdapter
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.movaapp.common.utils.Extensions.visible
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CartFragment : BaseFragment<FragmentCartBinding>(FragmentCartBinding::inflate) {

    private val viewModel: CartViewModel by viewModels()
    private val cartAdapter = CartAdapter()

    override fun observeEvents() {
        viewModel.cartState.observe(viewLifecycleOwner) { handleState(it) }
    }

    private fun handleState(it: CartUiState) {
        with(binding){
            when(it){
                is CartUiState.CartData -> {
                    loadingView.gone()
                    cartAdapter.differ.submitList(it.data)
                }
                is CartUiState.Error -> {
                    loadingView.gone()
                    requireActivity().showMessage(it.message,FancyToast.ERROR)
                }
                CartUiState.Loading -> {
                    loadingView.visible()
                }
            }

        }
    }

    override fun onCreateFinish() {
        binding.rvCart.adapter = cartAdapter
    }

    override fun setupListeners() {

    }

}