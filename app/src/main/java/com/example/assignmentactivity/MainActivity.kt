package com.example.assignmentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.assignmentactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewPager: ViewPager
    lateinit var myAdapter: ViewAdaptor

    private var images = intArrayOf(
        R.drawable._1,
        R.drawable._2,
        R.drawable._3,
        R.drawable._4,
        R.drawable._5,
        R.drawable._6,
        R.drawable._7,
        R.drawable._8
    )

    //Variables for gridView
    lateinit var recyclerView: RecyclerView
    lateinit var gridAdapter: GridAdapter
    var dataList = mutableListOf<GridData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //code for image swiping
        viewPager = findViewById<ViewPager>(R.id.viewPager)
        myAdapter = ViewAdaptor(this, images)
        viewPager!!.adapter = myAdapter

        //code for gridView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 3)
        gridAdapter = GridAdapter(applicationContext)
        recyclerView.adapter = gridAdapter

        //Adding image path to GridData class
        addGridData(images)

        gridAdapter.setDataList(dataList)

    }

    private fun addGridData(dataImage: IntArray) {
        for (j in 1..3) {
            for (i in 0..dataImage.lastIndex) {
                dataList.add(GridData(dataImage[i]))
            }
        }

    }
}

