package com.example.assignmentactivity.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentactivity.R
import com.example.assignmentactivity.models.GridData

class GridAdapter(var context: Context) : RecyclerView.Adapter<GridAdapter.ViewHolder>() {

    var dataList= emptyList<GridData>()

    internal fun setDataList(dataList: List<GridData>){
        this.dataList=dataList
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var image:ImageView
        init {
            image=itemView.findViewById(R.id.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var  view = LayoutInflater.from(parent.context).inflate(
           R.layout.grid_item_view, parent,
               false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      var data=dataList[position]
        holder.image.setImageResource(data.image)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}