package com.omarismayilov.busybag.presentation.ui.favorite

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentFavouriteBinding
import com.omarismayilov.busybag.presentation.ui.favorite.adapter.FavoriteAdapter
import com.omarismayilov.movaapp.common.utils.Extensions.gone
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
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

    private fun handleState(it: FavoriteUiState) {
        with(binding){
            when(it){
                is FavoriteUiState.SuccessFavData->{
                    if (it.data.isEmpty()){ tvEmpty.visible() }else{ tvEmpty.gone() }
                    favoriteAdapter.differ.submitList(it.data)
                    loading5.gone()
                }
                is FavoriteUiState.SuccessDeleteData->{
                    requireActivity().showMessage(it.message,FancyToast.INFO)
                }
                is FavoriteUiState.Error->{
                    loading5.gone()
                    requireActivity().showMessage(it.message,FancyToast.ERROR)
                }
                is FavoriteUiState.Loading->{
                    loading5.visible()
                }
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
            }
            favoriteAdapter.onClick={
                findNavController().navigate(FavouriteFragmentDirections.actionFavouriteFragmentToDetailFragment3(it))
            }
        }
    }

}