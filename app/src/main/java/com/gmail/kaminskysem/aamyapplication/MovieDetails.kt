package com.gmail.kaminskysem.aamyapplication

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.graphics.Shader.TileMode
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MovieDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        Log.d("DetailsActivity.class" , "onCreate" )
        val tvTitle = findViewById<TextView>(R.id.tv_md_name_movie)
        val tvStoryLine = findViewById<TextView>(R.id.tv_md_title_storyline)
        val tvCast = findViewById<TextView>(R.id.tv_md_cast)
        val tvBack = findViewById<TextView>(R.id.tv_md_back)


        tvBack.setOnClickListener {
            openMainActivity()
        }


        useGradientToTV(tvTitle)
        useGradientToTV(tvStoryLine)
        useGradientToTV(tvCast)


    }
    private fun openMainActivity() {
        val intentMain = Intent(this, MainActivity::class.java)
        startActivity(intentMain)
    }

    private fun useGradientToTV(tv: TextView) {
        val col1 = Color.parseColor("#ECECEC")
        val col2 = Color.parseColor("#C4C4C4")
        val col3 = Color.parseColor("#FFFFFF")
        val textShader: Shader = LinearGradient(0f, 6f, 12f, 0f, intArrayOf(col1, col2, col3), floatArrayOf(0f, 1f,1f), TileMode.CLAMP)
        tv.getPaint().setShader(textShader)
    }
}