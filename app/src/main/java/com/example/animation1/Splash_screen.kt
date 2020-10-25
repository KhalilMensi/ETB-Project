package com.example.animation1

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_splash_screen.*

class Splash_screen : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        img_view.alpha = 0f;
        site.animate().setDuration(1100).translationY(-100f)
        img_view.animate().setDuration(3000).alpha(1f).withEndAction {
            startActivity(Intent(this,MainActivity::class.java));
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            finish();
        }
    }
}