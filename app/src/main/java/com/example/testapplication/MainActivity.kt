package com.example.testapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var LOG_TAG = "MYLOG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "Strange that I did not know him then,")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "That friend of mine!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "I did not even show him then")

    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "One friendly sign;")
    }

    }
