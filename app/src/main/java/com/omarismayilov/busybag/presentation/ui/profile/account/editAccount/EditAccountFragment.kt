package com.omarismayilov.busybag.presentation.ui.profile.account.editAccount

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.omarismayilov.busybag.R
import com.omarismayilov.busybag.common.InfoEnum
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentEditAccountBinding
import com.omarismayilov.movaapp.common.utils.Extensions.visible


class EditAccountFragment :
    BaseFragment<FragmentEditAccountBinding>(FragmentEditAccountBinding::inflate) {

    private val args: EditAccountFragmentArgs by navArgs()

    override fun observeEvents() {

    }

    override fun onCreateFinish() {
        val info = args.infoName
        binding.info = info
        handleLayout(info)
    }

    private fun handleLayout(info: InfoEnum) {
        with(binding){
            when(info){
                InfoEnum.NAME->{
                    lyName.visible()
                }
                InfoEnum.EMAIL->{
                    lyEmail.visible()
                }
                InfoEnum.GENDER->{
                    setGenderLayout()
                }
                InfoEnum.PASSWORD->{
                    lyPassword.visible()
                }
                InfoEnum.BIRTHDAY->{
                    lyBirthday.visible()
                }
                InfoEnum.PHONENUMBER->{
                    lyPhoneNumber.visible()
                }
            }
        }
    }

    private fun setGenderLayout() {
        with(binding){
            lyGender.visible()
            val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, resources.getStringArray(R.array.gender))
            binding.autoCompleteTextView.setAdapter(arrayAdapter)

            autoCompleteTextView.setOnItemClickListener { _, _, position, _ ->
                val selectedGender = arrayAdapter.getItem(position).toString()

            }
        }
    }

    override fun setupListeners() {
        with(binding){
            btnBack.setOnClickListener {
                findNavController().popBackStack()
            }

        }
    }

}