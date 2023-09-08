package com.omarismayilov.busybag.presentation.ui.profile

import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding>(FragmentProfileBinding::inflate) {

    override fun observeEvents() {

    }

    override fun onCreateFinish() {

    }

    override fun setupListeners() {
        with(binding){
            btnProfile.setOnClickListener {
                findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToAccountFragment())
            }
            btnOrder.setOnClickListener {
                findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToOrderFragment())
            }
        }
    }

}