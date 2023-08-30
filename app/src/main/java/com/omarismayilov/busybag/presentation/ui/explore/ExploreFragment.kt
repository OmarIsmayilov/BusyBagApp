package com.omarismayilov.busybag.presentation.ui.explore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.appcompat.widget.SearchView
import androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextChange
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.R
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentExploreBinding
import com.omarismayilov.busybag.domain.model.ProductUiModel
import com.omarismayilov.busybag.presentation.ui.home.adapter.CategoryAdapter
import com.omarismayilov.busybag.presentation.ui.offer.adapter.ProductAdapter
import com.omarismayilov.movaapp.common.utils.Extensions.gone
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.movaapp.common.utils.Extensions.visible
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ExploreFragment : BaseFragment<FragmentExploreBinding>(FragmentExploreBinding::inflate) {

    private val viewModel: ExploreViewModel by viewModels()
    private val categoryAdapter = CategoryAdapter()
    private val productAdapter = ProductAdapter()

    override fun observeEvents() {
        viewModel.exploreState.observe(viewLifecycleOwner) {
            handleState(it)
        }
    }

    private fun handleState(it: ExploreUiState) {
        with(binding) {
            when (it) {
                is ExploreUiState.SuccessCategoryData -> {
                    categoryAdapter.differ.submitList(it.data)
                    loadingView.gone()
                }

                is ExploreUiState.SuccessSearchData -> {
                    if (it.data.isEmpty()) { lyError.visible() } else { lyError.gone() }
                    tvResult.text = "${it.data.size} Result"
                    productAdapter.differ.submitList(it.data)
                    loadingView.gone()
                }

                is ExploreUiState.SuccessProductData -> {}
                is ExploreUiState.Error -> {
                    loadingView.gone()
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                }

                is ExploreUiState.Loading -> {
                    loadingView.visible()
                }
            }
        }
    }

    override fun onCreateFinish() {
        setAdapter()
    }

    private fun setAdapter() {
        with(binding) {
            rvCategory.adapter = categoryAdapter
            rvSearch.adapter = productAdapter
        }
    }

    override fun setupListeners() {
        with(binding) {
            categoryAdapter.onClick = {
                findNavController().navigate(
                    ExploreFragmentDirections.actionExploreFragmentToProductListFragment2(
                        it
                    )
                )
            }

            btnBack.setOnClickListener {
                findNavController().navigate(ExploreFragmentDirections.actionExploreFragmentToHomeFragment())
            }



            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    query?.let { viewModel.getSearch(query) }
                    return true
                }

                override fun onQueryTextChange(query: String?): Boolean {
                    if (query.isNullOrEmpty()) {
                        lySearch.gone()
                        lyError.gone()
                        lyCategory.visible()
                    } else {
                        lySearch.visible()
                        lyCategory.gone()
                    }
                    return false
                }
            })
        }
    }

}