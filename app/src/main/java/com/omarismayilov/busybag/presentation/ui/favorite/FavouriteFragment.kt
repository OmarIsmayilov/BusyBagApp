package com.omarismayilov.busybag.presentation.ui.favorite

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.R
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentFavouriteBinding
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.presentation.ui.favorite.adapter.FavoriteAdapter
import com.omarismayilov.movaapp.common.utils.Extensions.gone
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.movaapp.common.utils.Extensions.showSnack
import com.omarismayilov.movaapp.common.utils.Extensions.visible
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FavouriteFragment : BaseFragment<FragmentFavouriteBinding>(FragmentFavouriteBinding::inflate) {

    private val favoriteAdapter = FavoriteAdapter()
    private val viewModel : FavoriteViewModel by viewModels()

    override fun observeEvents() {
        viewModel.favState.observe(viewLifecycleOwner){
            handleState(it)

        }
    }

    private fun handleState(it: AppUiState) {
        with(binding){
            when(it){
                is AppUiState.SuccessFavProductData-> {
                    if (it.data.isEmpty()) { tvEmpty.visible() } else { tvEmpty.gone() }
                    favoriteAdapter.differ.submitList(it.data)
                    loading5.gone()
                }
                is AppUiState.Error->{
                    loading5.gone()
                    requireActivity().showMessage(it.message,FancyToast.ERROR)
                }
                is AppUiState.Loading->{
                    loading5.visible()
                }
                else->{}
            }
        }
    }

    override fun onCreateFinish() {
        binding.rvFav.adapter = favoriteAdapter
    }

    override fun setupListeners() {
        with(binding){
            ibBack.setOnClickListener {
                findNavController().popBackStack()
            }
            favoriteAdapter.onDelete={
                viewModel.deleteFav(it)
                requireView().showSnack(getString(R.string.deleted))
            }
            favoriteAdapter.onClick={
                findNavController().navigate(FavouriteFragmentDirections.actionFavouriteFragmentToDetailFragment3(it))
            }
        }
    }

}