package com.omarismayilov.busybag.presentation.ui.auth

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentRegisterBinding
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.busybag.common.ValidationHelper
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.domain.model.UserUiModel
import com.omarismayilov.movaapp.common.utils.Extensions.gone
import com.omarismayilov.movaapp.common.utils.Extensions.showSnack
import com.omarismayilov.movaapp.common.utils.Extensions.visible
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale
import javax.inject.Inject

@AndroidEntryPoint
class RegisterFragment() : BaseFragment<FragmentRegisterBinding>(FragmentRegisterBinding::inflate) {

    @Inject
    lateinit var helper: ValidationHelper
    private val viewModel: AuthViewModel by viewModels()

    override fun observeEvents() {
        viewModel.authState.observe(viewLifecycleOwner) { handleState(it) }
    }

    override fun onCreateFinish() {}

    override fun setupListeners() {
        with(binding) {
            btnRegister.setOnClickListener {
                validateData()
            }
            btnLogin.setOnClickListener {
                findNavController().navigate(RegisterFragmentDirections.actionRegisterFragmentToLoginFragment())
            }
        }
    }

    private fun handleState(it: AppUiState) {
        with(binding) {
            when (it) {
                is AppUiState.SuccessAuth -> {
                    findNavController().navigate(RegisterFragmentDirections.actionRegisterFragmentToLoginFragment())
                    requireView().showSnack("Succesfully create user")
                    loading.gone()
                }

                is AppUiState.Error -> {
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                    loading.gone()
                }

                is AppUiState.Loading -> {
                    loading.visible()
                }
                else->{}

            }
        }
    }

    private fun validateData() {
        with(binding) {
            if (helper.validateData(etMail, etPass1, lyMail, lyPass1)
                && helper.validateRegisterData(etPass1, etPass2, etName, lyPass2, lyName)
            ) {
                viewModel.registerUser(
                    etMail.text.toString().trim(),
                    etPass1.text.toString().trim(),
                    UserUiModel(
                        uid = etMail.text.toString().trim(),
                        firstname = etName.text.toString().split(" ")[0] ?: "",
                        lastname  = etName.text.toString().split(" ")[1] ?: "",
                        email = etMail.text.toString().trim()
                    )
                )

            }
        }
    }

}