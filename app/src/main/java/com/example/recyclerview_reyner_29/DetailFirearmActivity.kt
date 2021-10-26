package com.example.recyclerview_reyner_29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class DetailFirearmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_firearm)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val firearm = intent.getParcelableExtra<Firearm>(MainActivity.INTENT_PARCELABLE)

        val imgFirearm = findViewById<ImageView>(R.id.img_item_photo)
        val nameFirearm = findViewById<TextView>(R.id.tv_item_name)
        val descDetailFirearm = findViewById<TextView>(R.id.tv_item_detail_description)
        val descSejarahFirearm = findViewById<TextView>(R.id.tv_item_sejarah)

        imgFirearm.setImageResource(firearm?.imgFirearm!!)
        nameFirearm.text = firearm.nameFirearm
        descDetailFirearm.text = firearm.descDetailFirearm
        descSejarahFirearm.text = firearm.descSejarahFirearm
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}