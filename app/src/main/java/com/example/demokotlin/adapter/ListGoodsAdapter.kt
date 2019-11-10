package com.example.demokotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demokotlin.R
import com.example.demokotlin.model.Good
import kotlinx.android.synthetic.main.item_row_good.view.*

class ListGoodsAdapter(private val listGoods : ArrayList<Good>) : RecyclerView.Adapter<ListGoodsAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_good, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listGoods.size


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listGoods[position])
    }

   inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       fun bind(goods: Good) {
           with(itemView){
               tv_goods_name.text = goods.name
               tv_goods_price.text = goods.price.toString()
               tv_goods_description.text = goods.description
           }
       }

    }

}