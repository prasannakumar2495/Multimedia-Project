package com.example.assignmentactivity.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import com.example.assignmentactivity.R

class ViewAdaptor(var context: Context, var image: IntArray): PagerAdapter() {
    lateinit var layoutInflater: LayoutInflater
    override fun getCount(): Int {
       return image.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view=layoutInflater.inflate(R.layout.item,container,false)
        val imageView = view.findViewById<View>(R.id.imageView) as ImageView
        imageView.setImageResource(image[position])
        container.addView(view)
        imageView.setOnClickListener{Toast.makeText(context,"Images "+(position+1),
        Toast.LENGTH_LONG).show()}
        return view
    }
    init {
        layoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}