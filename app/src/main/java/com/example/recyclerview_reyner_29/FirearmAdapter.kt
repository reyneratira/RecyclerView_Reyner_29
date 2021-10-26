package com.example.recyclerview_reyner_29

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FirearmAdapter(private val context: Context, private val firearm: List<Firearm>, val listener: (Firearm) -> Unit)
    : RecyclerView.Adapter<FirearmAdapter.FirearmViewHolder>(){

    class FirearmViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgFirearm = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameFirearm = view.findViewById<TextView>(R.id.tv_item_name)
        val descFirearm = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(firearm: Firearm, listener: (Firearm) -> Unit){
            imgFirearm.setImageResource(firearm.imgFirearm)
            nameFirearm.text = firearm.nameFirearm
            descFirearm.text = firearm.descFirearm
            itemView.setOnClickListener{
                listener(firearm)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirearmViewHolder {
        return FirearmViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_firearms, parent, false)
        )
    }

    override fun onBindViewHolder(holder: FirearmViewHolder, position: Int) {
        holder.bindView(firearm[position], listener)
    }

    override fun getItemCount(): Int = firearm.size
    }
