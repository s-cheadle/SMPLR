package com.wilsonhybrid.smplr

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView


class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val imageView: ImageView = findViewById(R.id.logo)
        val animation: Animation = AnimationUtils.loadAnimation(this.applicationContext,R.anim.mytransitions)
        imageView.startAnimation(animation)
    }

}
