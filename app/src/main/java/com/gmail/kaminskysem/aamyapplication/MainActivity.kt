package com.gmail.kaminskysem.aamyapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.DEBUG
import android.widget.ImageView
import androidx.constraintlayout.solver.LinearSystem.DEBUG
import com.gmail.kaminskysem.aamyapplication.BuildConfig.DEBUG

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity.class" , "onCreate" )

        val movie: ImageView = findViewById(R.id.iv_main_movie1)
        movie.setOnClickListener {
                openDetailsdActivity ()
            Log.d("MainActivity.class","onClick")
        }
    }

    private fun openDetailsdActivity() {
       val secondIntent=  Intent (this, MovieDetails::class.java)
        startActivity(secondIntent)
    }
}