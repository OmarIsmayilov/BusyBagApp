package com.omarismayilov.busybag.presentation.ui.profile.account.editAccount

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.omarismayilov.busybag.R
import com.omarismayilov.busybag.common.InfoEnum
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentEditAccountBinding
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.presentation.ui.auth.AuthViewModel
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.movaapp.common.utils.Extensions.showSnack
import com.omarismayilov.movaapp.common.utils.Extensions.visible
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class EditAccountFragment :
    BaseFragment<FragmentEditAccountBinding>(FragmentEditAccountBinding::inflate) {

    private val authViewModel : AuthViewModel by viewModels()
    private val args: EditAccountFragmentArgs by navArgs()
    private var infoText = ""

    override fun observeEvents() {
        authViewModel.authState.observe(viewLifecycleOwner){
            handleState(it)
        }
    }

    private fun handleState(it: AppUiState) {
        when(it){
            is AppUiState.Error -> {
                requireActivity().showMessage(it.message,FancyToast.ERROR)
            }
            AppUiState.Loading -> {}
            is AppUiState.SuccessUserInfo -> {
                binding.user = it.data
            }
            is AppUiState.SuccessUpdateInfo->{
                requireView().showSnack("Updated")
            }
            else->{}
        }
    }

    override fun onCreateFinish() {
        authViewModel.getUserInfo()
        binding.info = args.infoName
        handleLayout(args.infoName)
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
            binding.etGender.setAdapter(arrayAdapter)

            etGender.setOnItemClickListener { _, _, position, _ ->
                infoText = arrayAdapter.getItem(position).toString()
            }
        }
    }

    override fun setupListeners() {
        with(binding){
            btnBack.setOnClickListener {
                findNavController().popBackStack()
            }
            btnSave.setOnClickListener {
                when(args.infoName){
                    InfoEnum.NAME -> {
                        infoText = etFirstName.text.toString().trim() + " " +  etLastName.text.toString().trim()
                    }
                    InfoEnum.EMAIL -> {
                        infoText = etEmail.text.toString().trim()
                    }
                    InfoEnum.BIRTHDAY -> {
                        infoText = etBirthday.text.toString().trim()
                    }
                    InfoEnum.GENDER -> {

                    }
                    InfoEnum.PASSWORD -> {

                    }
                    InfoEnum.PHONENUMBER -> {
                        infoText = etNumber.text.toString().trim()
                    }
                }
                if (infoText.isEmpty()){
                    requireView().showSnack("Field cannot be empty")
                }else{
                    authViewModel.updateUser(args.infoName,infoText)
                }
            }

        }
    }

}