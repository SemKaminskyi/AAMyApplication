package com.gmail.kaminskysem.aamyapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movie: ImageView = findViewById(R.id.iv_main_movie1)
        movie.setOnClickListener {
                openDetailsdActivity ()
        }
    }

    private fun openDetailsdActivity() {
       val secondIntent=  Intent (this, MovieDetails::class.java)
        startActivity(secondIntent)
    }
}