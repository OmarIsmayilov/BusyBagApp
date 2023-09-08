package com.omarismayilov.busybag.presentation.ui.auth

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentLoginBinding
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.busybag.common.ValidationHelper
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
    private var uid: String = ""

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

    private fun handleState(it: AuthUiState) {
        with(binding) {
            when (it) {
                is AuthUiState.SuccessAuth -> {
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeFragment())
                    requireView().showSnack("Succesfully sign in")
                    loading.gone()
                }


                is AuthUiState.Error -> {
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                    loading.gone()
                }

                is AuthUiState.Loading -> {
                    loading.visible()
                }
            }
        }
    }


    private fun validateData() {
        with(binding) {
            if (helper.validateData(etMail, etPass, lyMail, lyPass)) {
                viewModel.loginUser(
                    etMail.text.toString().trim(), etPass.text.toString().trim(),
                    UserUiModel(uid=etMail.text.toString().trim(), email = etMail.text.toString().trim())
                )
            }
        }
    }


}