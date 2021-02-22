package com.recycler.view.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        val adapter = ItemAdapter()
        recyclerView.adapter = adapter
        val list: ArrayList<Item> = ArrayList()
        for (i in 1..24) list.add(Item(R.drawable.ic_launcher_foreground, "Item$i"))
        adapter.submitList(list)
    }
}