package com.ridvankabak.mvvm.util

import android.content.Context
import android.widget.Toast

fun Context.toast(mesaj : String){
    Toast.makeText(this,mesaj,Toast.LENGTH_LONG).show()
}