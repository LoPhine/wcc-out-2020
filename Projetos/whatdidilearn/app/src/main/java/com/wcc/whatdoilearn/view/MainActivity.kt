package com.wcc.whatdoilearn.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.wcc.whatdoilearn.R
import com.wcc.whatdoilearn.data.LearnedItemsDatabase
import com.wcc.whatdoilearn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.itemsLearnedRecyclerView
        val learnedItems = LearnedItemsDatabase()
        val adapter = LearnedItemsAdapter()

        recyclerView.adapter = adapter
        adapter.data = learnedItems
    }
}