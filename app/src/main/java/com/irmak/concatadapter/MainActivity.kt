package com.irmak.concatadapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.irmak.concatadapter.adapter.*
import com.irmak.concatadapter.data.DataSource
import com.irmak.concatadapter.databinding.ActivityMainBinding
import com.irmak.concatadapter.model.MyDetail

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var clickCount = 0
    lateinit var adapter: ConcatAdapter
    lateinit var myDetailAdapter: MyDetailAdapter
    lateinit var userVerticalAdapter: UsersAdapter
    lateinit var photoAdapter: PhotoAdapter
    private val myDetail =
        MyDetail(1, "Ahmet", "Ben üniversite 3.sınıf öğrencisi ve bir android developer'ım")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupDataInRecyclerView()
        binding.resimkaldR.setOnClickListener {
            clickCount++
            if (clickCount == 1){
                adapter.removeAdapter(photoAdapter)
            }else if (clickCount == 2){
                adapter.addAdapter(photoAdapter)
                clickCount = 0
            }

        }
    }

    private fun setupDataInRecyclerView() {
        with(binding) {
            userVerticalAdapter = UsersAdapter(DataSource.getUser())
            photoAdapter = PhotoAdapter(DataSource.getPhoto())
            myDetailAdapter = MyDetailAdapter(myDetail)
            adapter = ConcatAdapter(myDetailAdapter,userVerticalAdapter, photoAdapter)
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerView.adapter = adapter
        }
    }
}

// horizontal için adapter
// HorizontalConcatAdapter(this@MainActivity,userVerticalAdapter)