package com.omarismayilov.busybag.presentation.ui.explore


import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.omarismayilov.busybag.R
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentExploreBinding
import com.omarismayilov.busybag.domain.AppUiState
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

    private fun handleState(it: AppUiState) {
        with(binding) {
            when (it) {
                is AppUiState.SuccessCategoryData -> {
                    categoryAdapter.differ.submitList(it.list)
                    loadingView.gone()
                }
                is AppUiState.SuccessSearchData -> {
                    if (it.data.isEmpty()) { lyError.visible() } else { lyError.gone() }
                    tvResult.text = getString(R.string.result, it.data.size)
                    productAdapter.differ.submitList(it.data)
                    loadingView.gone()
                }
                is AppUiState.Error -> {
                    loadingView.gone()
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                }

                is AppUiState.Loading -> {
                    loadingView.visible()
                }
                else->{}
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
                findNavController().navigate(ExploreFragmentDirections.actionExploreFragmentToProductListFragment2(it))
            }
            btnBack.setOnClickListener {
                findNavController().navigate(ExploreFragmentDirections.actionExploreFragmentToHomeFragment())
            }
            productAdapter.onClick={
                findNavController().navigate(ExploreFragmentDirections.actionExploreFragmentToDetailFragment3(it))
            }
            ibFilter.setOnClickListener {
                findNavController().navigate(ExploreFragmentDirections.actionExploreFragmentToFilterFragment())
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