package com.omarismayilov.busybag.presentation.ui.splash


import android.content.ContentValues
import android.util.Log
import android.view.Gravity
import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.storage.FirebaseStorage
import com.omarismayilov.busybag.R
import com.omarismayilov.busybag.common.ValidationHelper
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentSplashBinding
import com.omarismayilov.busybag.domain.model.CategoryUiModel
import com.omarismayilov.movaapp.common.utils.Extensions.setStatusColor
import com.thecode.aestheticdialogs.AestheticDialog
import com.thecode.aestheticdialogs.DialogAnimation
import com.thecode.aestheticdialogs.DialogStyle
import com.thecode.aestheticdialogs.DialogType
import com.thecode.aestheticdialogs.OnDialogClickListener
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    @Inject
    lateinit var helper: ValidationHelper
    private val viewModel: SplashViewModel by viewModels()
    private var auth = false

    override fun observeEvents() {
        with(viewModel) {
            authData.observe(viewLifecycleOwner) {
                auth = it
            }
        }
    }

    override fun onCreateFinish() {
        requireActivity().setStatusColor(R.color.blue)
        lifecycleScope.launch {
            delay(2000)
            if (!helper.isInternetAvailable()) {
                showNoInternetDialog()
            }else{
                if (auth) {
                    findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToHomeFragment())
                } else {
                    findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToLoginFragment())
                }
            }
            requireActivity().setStatusColor(R.color.white)
        }
    }

    override fun setupListeners() {}


    private fun showNoInternetDialog() {
        AestheticDialog.Builder(requireActivity(), DialogStyle.CONNECTIFY, DialogType.ERROR)
            .setTitle(getString(R.string.no_internet_connection))
            .setMessage(getString(R.string.please_check_your_connection))
            .setCancelable(false)
            .setDarkMode(false)
            .setGravity(Gravity.BOTTOM)
            .setAnimation(DialogAnimation.SHRINK)
            .setOnClickListener(object : OnDialogClickListener {
                override fun onClick(dialog: AestheticDialog.Builder) {
                    requireActivity().finish()
                }
            })
            .show()
    }

}