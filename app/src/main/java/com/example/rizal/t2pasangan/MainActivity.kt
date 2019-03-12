package com.example.rizal.t2pasangan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener { carijodoh() }

    }
    fun carijodoh() {
        val randomperempuan = Random().nextInt(5)+1
        val randomlaki = Random().nextInt(5)+1
        val drawableResperempuan = when (randomperempuan){
            1 ->R.drawable.ayu
            2 ->R.drawable.hanum
            3 ->R.drawable.ayu
            4 ->R.drawable.umi
            5 ->R.drawable.mela
            else ->R.drawable.hanum}

        val drawableReslaki = when (randomlaki){
            1 ->R.drawable.rizal
            2 ->R.drawable.kiki
            3 ->R.drawable.rizal
            4 ->R.drawable.eggy
            5 ->R.drawable.haris
            else -> R.drawable.niam

        }

        perempuan.setImageResource(drawableResperempuan)
        laki.setImageResource(drawableReslaki)



    } }


