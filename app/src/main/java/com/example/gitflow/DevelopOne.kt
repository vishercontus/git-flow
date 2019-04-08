package com.example.gitflow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DevelopOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_develop_one)

        Log.d("DevelopOne", "About")
    }
}
