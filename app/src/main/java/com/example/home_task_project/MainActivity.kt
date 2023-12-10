package com.example.home_task_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToSecondActivity()
    }

    private fun goToSecondActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}