package com.omarismayilov.movaapp.common.utils

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.view.View
import androidx.core.content.ContextCompat
import com.androchef.happytimer.countdowntimer.DynamicCountDownView
import com.androchef.happytimer.countdowntimer.HappyTimer
import com.google.android.material.snackbar.Snackbar
import com.omarismayilov.busybag.R
import com.omarismayilov.movaapp.common.utils.Extensions.showSnack
import com.shashank.sony.fancytoastlib.FancyToast
import java.text.SimpleDateFormat
import java.util.Locale

object Extensions {

    fun Activity.showMessage(
        message: String,
        style: Int,
    ) {
        FancyToast.makeText(this, message, FancyToast.LENGTH_SHORT, style, false).show()
    }

    fun View.showSnack(
        message: String,
        duration: Int = Snackbar.LENGTH_SHORT,
    ) {
        Snackbar.make(this, message, duration)
            .setBackgroundTint(Color.parseColor("#40BFFF"))
            .setAnimationMode(Snackbar.ANIMATION_MODE_SLIDE)
            .setTextColor(Color.WHITE)
            .show()
    }

    fun List<View>.goneEach() {
        this.forEach {
            it.gone()
        }
    }


    fun List<View>.visibleEach() {
        this.forEach {
            it.visible()
        }
    }

    fun DynamicCountDownView.setTimer(date: String?, context: Context) {
        if (!date.isNullOrEmpty()) {
            val currentTimeMillis = System.currentTimeMillis()
            val expirationTimeMillis =
                SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault()).parse(date)?.time
                    ?: 0

            if (currentTimeMillis < expirationTimeMillis) {
                this.visible()
                val remainingSeconds = (expirationTimeMillis - currentTimeMillis) / 1000
                initTimer(remainingSeconds.toInt())
                customBackgroundDrawable = ContextCompat.getDrawable(context, R.drawable.timer_bg)
                timerType = HappyTimer.Type.COUNT_DOWN
                startTimer()
            } else {
                this.gone()
                stopTimer()
            }
        } else {
            this.gone()
            stopTimer()
        }
    }


    fun View.visible() {
        this.visibility = View.VISIBLE
    }

    fun View.gone() {
        this.visibility = View.GONE
    }

    fun View.alpha(alpha: Float) {
        this.alpha = alpha
    }

    fun Activity.setStatusColor(color: Int) {
        this.window.statusBarColor = ContextCompat.getColor(this.applicationContext, color)
    }


}