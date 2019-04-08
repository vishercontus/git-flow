package com.example.gitflow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_feature_one.*

class FeatureOne : AppCompatActivity() {

    companion object {
        val TAG = this.javaClass.name.toString().toUpperCase()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_one)
        Toast.makeText(this, "Feature One", Toast.LENGTH_SHORT).show()
        foButton.setOnClickListener {
            Log.d(TAG,"Button Clicked")
        }
    }
}
