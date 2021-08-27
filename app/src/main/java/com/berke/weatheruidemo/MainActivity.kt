package com.berke.weatheruidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.berke.weatheruidemo.databinding.ActivityMainBinding
import android.graphics.Shader.TileMode
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Thanks for user interface https://dribbble.com/tyronehua
        //UI Link: https://dribbble.com/shots/14958600-Weather-App

        val textShader: Shader = LinearGradient(
            0f,
            0f,
            70f,
            binding.celcius.textSize,
            intArrayOf(ContextCompat.getColor(this, R.color.white), ContextCompat.getColor(this, R.color.alto_apprx)),
            null,
            TileMode.CLAMP
        )
        binding.celcius.paint.shader = textShader
    }
}