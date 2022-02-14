package com.example.sample30

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CustomAdapter(private val context:Context, private val dataList: ArrayList<DataVo>) : RecyclerView.Adapter<ItemViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.view_item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(dataList[position], context)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}

class ItemViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
    private val userPhoto = itemView.findViewById<ImageView>(R.id.img_profile)
    private val userName = itemView.findViewById<TextView>(R.id.userNameTxt)
    private val userPay = itemView.findViewById<TextView>(R.id.payTxt)
    private val userAddress = itemView.findViewById<TextView>(R.id.addressTxt)

    //data -> resource (=binding)
    fun bind(dataVo: DataVo, context: Context){
        //사진 세팅
        if(dataVo.photo != ""){
            val resourceId = context.resources.getIdentifier(dataVo.photo, "drawable", context.packageName)

            if(resourceId > 0){ //이미지를 얻어옴
                userPhoto.setImageResource(resourceId)
            }else{  //이미지를 얻어오지 못함
                //로딩을 다시 해줌
                Glide.with(itemView).load(dataVo.photo).into(userPhoto)
                //userPhoto.setImageResource(R.mipmap.ic_launcher_round) //=> 아무 이미지 출력
            }
        }else{
            userPhoto.setImageResource(R.mipmap.ic_launcher_round)  //이미지 없다. 지원되는 아무 이미지 뿌려라
        }
        
        //TextView에 데이터를 세팅
        userName.text = dataVo.name
        userPay.text = dataVo.pay.toString()
        userAddress.text = dataVo.address

        //itemview를 클릭시 이벤트 발생
        itemView.setOnClickListener{
            println(dataVo.name + " " + dataVo.photo)

            //ProfileDetailActivity로 이동
            Intent(context, ProfileDetailActivity::class.java).apply {
                //짐싸!
                putExtra("data", dataVo)

                //현재 화면 위에 덮어쓰는 느낌
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }.run { context.startActivity(this) }
        }
    }
}