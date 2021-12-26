package com.example.assignmentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    lateinit var viewPager: ViewPager
    lateinit var myAdapter: ViewAdaptor

    var images = intArrayOf(
        R.drawable.cold,
        R.drawable.covid,
        R.drawable.curequickly,
        R.drawable.mask,
        R.drawable.st,
        R.drawable.stay,
        R.drawable.waitinghall,
        R.drawable.washing
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

        dataList.add(GridData(R.drawable.cold))
        dataList.add(GridData(R.drawable.covid))
        dataList.add(GridData(R.drawable.curequickly))
        dataList.add(GridData(R.drawable.mask))
        dataList.add(GridData(R.drawable.waitinghall))
        dataList.add(GridData(R.drawable.washing))
        dataList.add(GridData(R.drawable.cold))
        dataList.add(GridData(R.drawable.covid))
        dataList.add(GridData(R.drawable.curequickly))
        dataList.add(GridData(R.drawable.mask))
        dataList.add(GridData(R.drawable.waitinghall))
        dataList.add(GridData(R.drawable.washing))
        dataList.add(GridData(R.drawable.cold))
        dataList.add(GridData(R.drawable.covid))
        dataList.add(GridData(R.drawable.curequickly))
        dataList.add(GridData(R.drawable.mask))
        dataList.add(GridData(R.drawable.waitinghall))
        dataList.add(GridData(R.drawable.washing))
        dataList.add(GridData(R.drawable.cold))
        dataList.add(GridData(R.drawable.covid))
        dataList.add(GridData(R.drawable.curequickly))
        dataList.add(GridData(R.drawable.mask))
        dataList.add(GridData(R.drawable.waitinghall))
        dataList.add(GridData(R.drawable.washing))
        gridAdapter.setDataList(dataList)
    }
}

