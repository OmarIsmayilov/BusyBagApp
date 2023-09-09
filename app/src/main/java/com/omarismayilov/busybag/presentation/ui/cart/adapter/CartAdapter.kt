package com.omarismayilov.busybag.presentation.ui.cart.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.omarismayilov.busybag.data.local.cart.CartDTO
import com.omarismayilov.busybag.databinding.ItemCartBinding
import com.omarismayilov.busybag.domain.model.CartUiModel


class CartAdapter : RecyclerView.Adapter<CartAdapter.CartHolder>() {
    inner class CartHolder(val binding:ItemCartBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item:CartUiModel){
            binding.product = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartHolder {
        val view = ItemCartBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CartHolder(view)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: CartHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    val differ = AsyncListDiffer(this,CartDiffUtil)

    object CartDiffUtil : DiffUtil.ItemCallback<CartUiModel>() {
        override fun areItemsTheSame(oldItem: CartUiModel, newItem: CartUiModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CartUiModel, newItem: CartUiModel): Boolean {
            return oldItem == newItem
        }
    }
}
