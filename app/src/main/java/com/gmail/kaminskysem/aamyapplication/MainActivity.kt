package com.gmail.kaminskysem.aamyapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import android.util.Log.DEBUG
import android.widget.ImageView
import androidx.constraintlayout.solver.LinearSystem.DEBUG
import com.gmail.kaminskysem.aamyapplication.BuildConfig.DEBUG

class MainActivity : AppCompatActivity() {
    private var fragmentDetails = FragmentDetails()
    private  val LOG_TAG = this.javaClass.name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "onCreate" )

        val movie: ImageView = findViewById(R.id.iv_main_movie1)
        movie.setOnClickListener {
                openDetailsdActivity ()
            Log.d(LOG_TAG,"onClick movie")
        }

    }

    private fun openDetailsdActivity() {
        supportFragmentManager.beginTransaction()
            .apply {
                add(R.id.main_frag_details_container,fragmentDetails)
                commit()
            }
    }
}