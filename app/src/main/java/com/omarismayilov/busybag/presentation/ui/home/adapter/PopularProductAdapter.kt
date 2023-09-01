package com.omarismayilov.busybag.presentation.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import com.omarismayilov.busybag.common.ProductDiffCallBack
import com.omarismayilov.busybag.databinding.ItemProductBinding
import com.omarismayilov.busybag.domain.model.ProductUiModel

class PopularProductAdapter : RecyclerView.Adapter<PopularProductAdapter.ProductViewHolder>() {

    var onClick: (Int) -> Unit = {}

    inner class ProductViewHolder(val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ProductUiModel) {
            binding.product = item
            binding.executePendingBindings()

            itemView.setOnClickListener {
                onClick(item.id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }


    val differ = AsyncListDiffer(this, ProductDiffCallBack)


}