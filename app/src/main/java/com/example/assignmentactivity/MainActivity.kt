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

    var images = intArrayOf(
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

    //code for imageContent
    lateinit var imageClick:ImageView

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

        dataList.add(GridData(R.drawable._1))
        dataList.add(GridData(R.drawable._2))
        dataList.add(GridData(R.drawable._3))
        dataList.add(GridData(R.drawable._4))
        dataList.add(GridData(R.drawable._5))
        dataList.add(GridData(R.drawable._6))
        dataList.add(GridData(R.drawable._7))
        dataList.add(GridData(R.drawable._8))
        dataList.add(GridData(R.drawable._1))
        dataList.add(GridData(R.drawable._2))
        dataList.add(GridData(R.drawable._3))
        dataList.add(GridData(R.drawable._4))
        dataList.add(GridData(R.drawable._5))
        dataList.add(GridData(R.drawable._6))
        dataList.add(GridData(R.drawable._7))
        dataList.add(GridData(R.drawable._8))
        dataList.add(GridData(R.drawable._1))
        dataList.add(GridData(R.drawable._2))
        dataList.add(GridData(R.drawable._3))
        dataList.add(GridData(R.drawable._4))
        dataList.add(GridData(R.drawable._5))
        dataList.add(GridData(R.drawable._6))
        dataList.add(GridData(R.drawable._7))
        dataList.add(GridData(R.drawable._8))
        gridAdapter.setDataList(dataList)

    }
}

