package com.example.home_task_project

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.home_task_project.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private var count = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i("SecondActivity", "onCreate() called")

        binding.counterText.text = "Count: $count"
    }

    override fun onStart() {
        super.onStart()
        Log.i("SecondActivity", "onStart() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("SecondActivity", "onRestart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("SecondActivity", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("SecondActivity", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("SecondActivity", "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("SecondActivity", "onDestroy() called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", count)
        Log.i("SecondActivity", "onSaveInstanceState() called")
    }

    @SuppressLint("SetTextI18n")
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        count = savedInstanceState.getInt("count") + 1
        binding.counterText.text = "Count: $count"
        Log.i("SecondActivity", "onRestoreInstanceState() called")
    }
}