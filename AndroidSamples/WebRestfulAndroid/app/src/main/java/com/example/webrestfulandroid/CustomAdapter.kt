package com.example.webrestfulandroid

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val context: Context, val datalist:ArrayList<BbsDto>): RecyclerView.Adapter<CustomAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title = itemView.findViewById<TextView>(R.id.titleText)
        val id = itemView.findViewById<TextView>(R.id.idText)
        val date = itemView.findViewById<TextView>(R.id.dateText)
        val readCnt = itemView.findViewById<TextView>(R.id.readCntText)

        fun bind(dataVo:BbsDto, context: Context){
            title.text = dataVo.title
            id.text = dataVo.id
            date.text = dataVo.wdate
            readCnt.text = dataVo.readcount.toString()

            itemView.setOnClickListener{
                Intent(context, BbsDetailActivity::class.java).apply {
                    putExtra("data", dataVo)
                }.run { context.startActivity(this) }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.view_item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(datalist[position], context)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

}