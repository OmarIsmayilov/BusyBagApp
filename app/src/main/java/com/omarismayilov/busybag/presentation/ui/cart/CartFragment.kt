package com.omarismayilov.busybag.presentation.ui.cart

import androidx.fragment.app.viewModels
import com.androchef.happytimer.utils.extensions.gone
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
        viewModel.totalPrice.observe(viewLifecycleOwner){
            binding.total = it.toDouble()
        }
    }

    private fun handleState(it: CartUiState) {
        with(binding){
            when(it){
                is CartUiState.CartData -> {
                    loadingView.gone()
                    if (it.data.isEmpty()) { tvEmpty.visible() } else { tvEmpty.gone() }
                    cartAdapter.differ.submitList(it.data)
                    binding.size = it.data.size
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
        with(binding){
            cartAdapter.onDelete={
                 viewModel.deleteProduct(it)
            }
            cartAdapter.onClickMinus={
                viewModel.decreasePrice(it)
            }
            cartAdapter.onClickPlus={
                viewModel.increasePrice(it)
            }
        }
    }

}