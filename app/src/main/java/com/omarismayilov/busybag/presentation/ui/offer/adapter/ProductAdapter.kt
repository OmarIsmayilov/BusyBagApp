package com.omarismayilov.busybag.presentation.ui.offer.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.omarismayilov.busybag.common.ProductDiffCallBack
import com.omarismayilov.busybag.databinding.ItemPrimaryProductBinding
import com.omarismayilov.busybag.domain.model.ProductUiModel

class ProductAdapter : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    var onClick: (Int) -> Unit = {}

    inner class ProductViewHolder(val binding: ItemPrimaryProductBinding) :
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
        val view = ItemPrimaryProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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