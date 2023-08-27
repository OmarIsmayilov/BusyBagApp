package com.omarismayilov.movaapp.common.utils

import android.app.Activity
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import com.omarismayilov.busybag.R
import com.shashank.sony.fancytoastlib.FancyToast

object Extensions {

    fun Activity.showMessage(
        message: String,
        style: Int,
    ) {
        FancyToast.makeText(this,message,FancyToast.LENGTH_SHORT,style,false).show()
    }

    fun View.visible(){
        this.visibility = View.VISIBLE
    }

    fun View.gone(){
        this.visibility = View.GONE
    }

    fun View.alpha(alpha:Float){
        this.alpha = alpha
    }

    fun Activity.setStatusColor(color:Int){
        this.window.statusBarColor = ContextCompat.getColor(this.applicationContext,color)
    }



}