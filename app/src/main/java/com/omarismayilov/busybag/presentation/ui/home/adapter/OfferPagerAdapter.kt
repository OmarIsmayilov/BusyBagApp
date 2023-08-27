package com.omarismayilov.busybag.presentation.ui.home.adapter

import android.content.ContentValues
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.omarismayilov.busybag.domain.model.OfferUiModel
import com.omarismayilov.busybag.databinding.ItemOfferBinding

class OfferPagerAdapter : RecyclerView.Adapter<OfferPagerAdapter.OfferViewHolder>() {
    var onClick: (OfferUiModel) -> Unit = {}

    inner class OfferViewHolder(val binding: ItemOfferBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: OfferUiModel) {
            binding.offer = item
            binding.executePendingBindings()

            itemView.setOnClickListener {
                onClick(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val view = ItemOfferBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OfferViewHolder(view)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    object OfferDiffUtilCallback : DiffUtil.ItemCallback<OfferUiModel>() {
        override fun areItemsTheSame(oldItem: OfferUiModel, newItem: OfferUiModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: OfferUiModel, newItem: OfferUiModel): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, OfferDiffUtilCallback)


}