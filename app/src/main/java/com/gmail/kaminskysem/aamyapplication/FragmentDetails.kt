package com.gmail.kaminskysem.aamyapplication

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment


class FragmentDetails : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var tvTitle = view.findViewById<TextView>(R.id.tv_md_name_movie)
        var tvStoryLine = view.findViewById<TextView>(R.id.tv_md_title_storyline)
        var tvCast = view.findViewById<TextView>(R.id.tv_md_cast)
        var tvBack = view.findViewById<TextView>(R.id.tv_md_back)

        tvBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
             useGradientToTV(tvTitle)
             useGradientToTV(tvStoryLine)
             useGradientToTV(tvCast)



    }

    override fun onResume() {
        super.onResume()

    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()

    }


    private fun useGradientToTV(tv: TextView) {
        val col1 = Color.parseColor("#ECECEC")
        val col2 = Color.parseColor("#C4C4C4")
        val col3 = Color.parseColor("#FFFFFF")
        val textShader: Shader = LinearGradient(0f, 6f, 12f, 0f, intArrayOf(col1, col2, col3), floatArrayOf(0f, 1f,1f), Shader.TileMode.CLAMP)
        tv.getPaint().setShader(textShader)
    }

}