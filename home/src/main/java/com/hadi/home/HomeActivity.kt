package com.hadi.home

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.hadi.datasource.repository.PhotoRepository
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val adapter = PhotosAdapter()
        adapter.setHasStableIds(true)
        val photosRv = findViewById<RecyclerView>(R.id.photos_rv)
        photosRv.adapter = adapter

        lifecycleScope.launch {
            adapter.submitList(HomeViewModel(PhotoRepository).fetchAllToys())
        }
    }
}