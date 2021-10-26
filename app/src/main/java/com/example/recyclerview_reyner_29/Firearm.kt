package com.example.recyclerview_reyner_29

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Firearm(
    val imgFirearm: Int,
    val nameFirearm: String,
    val descFirearm: String,
    val descDetailFirearm: String,
    val descSejarahFirearm: String,
) : Parcelable
