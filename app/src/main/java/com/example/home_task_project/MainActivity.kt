package com.example.home_task_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // При запуске Activity, покажем по умолчанию первый фрагмент
        supportFragmentManager.beginTransaction().replace(R.id.container, FirstFragment()).commit()
    }
}