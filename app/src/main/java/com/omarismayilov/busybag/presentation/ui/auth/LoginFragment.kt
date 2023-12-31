package com.omarismayilov.busybag.presentation.ui.auth

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.R
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentLoginBinding
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.busybag.common.ValidationHelper
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.domain.model.UserUiModel
import com.omarismayilov.movaapp.common.utils.Extensions.gone
import com.omarismayilov.movaapp.common.utils.Extensions.showSnack
import com.omarismayilov.movaapp.common.utils.Extensions.visible
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {

    @Inject
    lateinit var helper: ValidationHelper
    private val viewModel: AuthViewModel by viewModels()

    override fun observeEvents() {
        with(viewModel) {
            with(binding) {
                authState.observe(viewLifecycleOwner) { handleState(it) }
            }
        }
    }

    override fun onCreateFinish() {}

    override fun setupListeners() {
        with(binding) {
            btnLogin.setOnClickListener {
                validateData()
            }
            btnRegister.setOnClickListener {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRegisterFragment())
            }
        }
    }

    private fun handleState(it: AppUiState) {
        with(binding) {
            when (it) {
                is AppUiState.SuccessAuth -> {
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeFragment())
                    requireView().showSnack(getString(R.string.succesfully_sign_in))
                    loading.gone()
                }

                is AppUiState.Error -> {
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                    loading.gone()
                }

                is AppUiState.Loading -> {
                    loading.visible()
                }
                else -> {}
            }
        }
    }


    private fun validateData() {
        with(binding) {
            if (helper.validateData(etMail, etPass, lyMail, lyPass)) {
                viewModel.loginUser(
                    etMail.text.toString().trim(), etPass.text.toString().trim()
                )
            }
        }
    }


}