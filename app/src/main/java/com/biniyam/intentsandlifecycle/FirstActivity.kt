package com.biniyam.intentsandlifecycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var send: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        name=findViewById(R.id.editTextName)
        age=findViewById(R.id.editTextAge)
        send=findViewById(R.id.btnSend)

        send.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)

            var userName = name.text.toString()
            var userAge = age.text.toString().toInt()

            intent.putExtra("key userName", userName)
            intent.putExtra("key userAge", userAge)

            startActivity(intent)
        }


    }
}