package com.omarismayilov.busybag.presentation.ui.favorite

import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentFavouriteBinding
import com.omarismayilov.busybag.presentation.ui.offer.adapter.ProductAdapter


class FavouriteFragment : BaseFragment<FragmentFavouriteBinding>(FragmentFavouriteBinding::inflate) {

    private val productAdapter = ProductAdapter()

    override fun observeEvents() {

    }

    override fun onCreateFinish() {
        binding.rvFav.adapter = productAdapter
    }

    override fun setupListeners() {
        with(binding){
            ibBack.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }

}