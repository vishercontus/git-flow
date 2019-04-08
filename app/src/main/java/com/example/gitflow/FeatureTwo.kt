package com.example.gitflow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class FeatureTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this, "Feature One", Toast.LENGTH_SHORT).show()
    }
}
