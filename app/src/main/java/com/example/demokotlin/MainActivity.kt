package com.example.demokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demokotlin.adapter.ListGoodsAdapter
import com.example.demokotlin.model.Good
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<Good>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_goods.setHasFixedSize(true)

        list.addAll(getListGood())

        showRecyclerList()
    }

    private fun getListGood(): ArrayList<Good> {
        val goodsData = GoodsData().getListData()

         return goodsData
    }

    private fun showRecyclerList() {
        rv_goods.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListGoodsAdapter(list)
        rv_goods.adapter = listHeroAdapter
    }
}
