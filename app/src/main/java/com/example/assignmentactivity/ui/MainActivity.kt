package com.example.assignmentactivity.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.assignmentactivity.R
import com.example.assignmentactivity.adapters.GridAdapter
import com.example.assignmentactivity.adapters.ViewAdaptor
import com.example.assignmentactivity.models.GridData
import com.example.assignmentactivity.models.ImagesList
import android.util.Log

class MainActivity : AppCompatActivity() {

    lateinit var viewPager: ViewPager
    lateinit var myAdapter: ViewAdaptor


    var imageData = ImagesList()

    //Variables for gridView
    lateinit var recyclerView: RecyclerView
    lateinit var gridAdapter: GridAdapter
    var dataList = mutableListOf<GridData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        try {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            //code for image swiping
            viewPager = findViewById<ViewPager>(R.id.viewPager)
            myAdapter = ViewAdaptor(this, imageData.images)
            viewPager!!.adapter = myAdapter

            //code for gridView
            recyclerView = findViewById(R.id.recyclerView)
            recyclerView.layoutManager = GridLayoutManager(applicationContext, 3)
            gridAdapter = GridAdapter(applicationContext)
            recyclerView.adapter = gridAdapter

            //Adding image path to GridData class
            addGridData(imageData.images)

            gridAdapter.setDataList(dataList)
        } finally {
            Log.ERROR
        }
    }

    private fun addGridData(dataImage: IntArray) {
        for (j in 1..3) {
            for (i in 0..dataImage.lastIndex) {
                dataList.add(GridData(dataImage[i]))
            }
        }

    }
}

