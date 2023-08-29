package com.omarismayilov.busybag.presentation.ui.favorite

import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentFavouriteBinding


class FavouriteFragment : BaseFragment<FragmentFavouriteBinding>(FragmentFavouriteBinding::inflate) {

    override fun observeEvents() {

    }

    override fun onCreateFinish() {

    }

    override fun setupListeners() {
        with(binding){
            ibBack.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }

}