package com.omarismayilov.busybag.presentation.ui.explore.productList

import android.view.View
import android.widget.AdapterView
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.omarismayilov.busybag.R
import com.omarismayilov.busybag.common.base.BaseFragment
import com.omarismayilov.busybag.databinding.FragmentProductListBinding
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.domain.model.ProductUiModel
import com.omarismayilov.busybag.presentation.ui.explore.ExploreViewModel
import com.omarismayilov.busybag.presentation.ui.offer.adapter.ProductAdapter
import com.omarismayilov.movaapp.common.utils.Extensions.gone
import com.omarismayilov.movaapp.common.utils.Extensions.showMessage
import com.omarismayilov.movaapp.common.utils.Extensions.visible
import com.shashank.sony.fancytoastlib.FancyToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductListFragment : BaseFragment<FragmentProductListBinding>(FragmentProductListBinding::inflate) {

    private val args : ProductListFragmentArgs by navArgs()
    private val viewModel : ExploreViewModel by viewModels()
    private val productAdapter = ProductAdapter()
    private var mCategory = ""


    override fun observeEvents() {
        viewModel.exploreState.observe(viewLifecycleOwner){
            handleState(it)
        }
    }

    override fun onCreateFinish() {
        mCategory = args.category
        setAdapter()
        initSpinner()
        binding.category = mCategory
        viewModel.getProductByCategory(mCategory)
    }

    private fun initSpinner() {
        val list =  resources.getStringArray(R.array.product_categories).toList()
        binding.spinner2.item =list

        binding.spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>, view: View, position: Int, id: Long) {
                mCategory = list[position].toString()
                viewModel.getProductByCategory(mCategory)
            }
            override fun onNothingSelected(adapterView: AdapterView<*>) {}
        }

    }

    private fun setAdapter() {
        binding.rvProduct.adapter = productAdapter
    }

    override fun setupListeners() {
        with(binding){
            ibBack.setOnClickListener {
                findNavController().navigate(ProductListFragmentDirections.actionProductListFragment2ToExploreFragment())
            }
            productAdapter.onClick={
                findNavController().navigate(ProductListFragmentDirections.actionProductListFragment2ToDetailFragment3(it))
            }
        }
    }


    private fun handleState(it: AppUiState) {
        with(binding){
            when(it){
                is AppUiState.SuccessProductsData->{
                    setProductData(it.data)
                    loadingView2.gone()
                }
                is AppUiState.Error->{
                    loadingView2.gone()
                    requireActivity().showMessage(it.message, FancyToast.ERROR)
                }
                is AppUiState.Loading->{
                    loadingView2.visible()
                }
                else->{}
            }
        }
    }

    private fun setProductData(data: List<ProductUiModel>) {
        with(binding){
            category = mCategory
            productAdapter.differ.submitList(data)
            tvResult2.text = getString(R.string.result, data.size)
        }
    }


}