package com.biniyam.intentsandlifecycle

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        result=findViewById(R.id.tvResult)

        var userName = intent.getStringExtra("key userName").toString()
        var userAge =intent.getIntExtra("key userAge", 0)

        result.text="You are $userName and you are $userAge years old."
    }
}