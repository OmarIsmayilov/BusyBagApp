package com.omarismayilov.busybag.presentation.ui.profile.account

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.common.InfoEnum
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentAccountBinding
import com.omarismayilov.busybag.presentation.ui.auth.AuthUiState
import com.omarismayilov.busybag.presentation.ui.auth.AuthViewModel
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.movaapp.common.utils.Extensions.showSnack
import com.omarismayilov.movaapp.common.utils.Extensions.toEditFragment
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AccountFragment : BaseFragment<FragmentAccountBinding>(FragmentAccountBinding::inflate) {
    private val authViewModel: AuthViewModel by viewModels()

    override fun observeEvents() {
        with(authViewModel){
            authState.observe(viewLifecycleOwner){
                handleState(it)
            }
        }
    }

    private fun handleState(it: AuthUiState) {
        when(it){
            is AuthUiState.SuccessAuth->{
                requireView().showSnack("Succesfully log out")
                findNavController().navigate(AccountFragmentDirections.actionAccountFragmentToLoginFragment())
            }
            is AuthUiState.Error->{
                requireActivity().showMessage(it.message, FancyToast.ERROR)
            }
            is AuthUiState.Loading->{}
        }
    }

    override fun onCreateFinish() {

    }

    override fun setupListeners() {
        with(binding) {
            btnBack.setOnClickListener {
                findNavController().navigate(AccountFragmentDirections.actionAccountFragmentToProfileFragment())
            }
            tvName.setOnClickListener {
                this@AccountFragment.toEditFragment(InfoEnum.NAME)
            }
            lyEmail.setOnClickListener {
                this@AccountFragment.toEditFragment(InfoEnum.EMAIL)
            }
            lyBirthday.setOnClickListener {
                this@AccountFragment.toEditFragment(InfoEnum.BIRTHDAY)
            }
            lyGender.setOnClickListener {
                this@AccountFragment.toEditFragment(InfoEnum.GENDER)
            }
            lyPassword.setOnClickListener {
                this@AccountFragment.toEditFragment(InfoEnum.PASSWORD)
            }
            lyNumber.setOnClickListener {
                this@AccountFragment.toEditFragment(InfoEnum.PHONENUMBER)
            }
            btnLogout.setOnClickListener {
                authViewModel.logoutUser()
            }
        }
    }

}