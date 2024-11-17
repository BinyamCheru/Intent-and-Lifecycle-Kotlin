package com.biniyam.intentsandlifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnIntent: Button
    lateinit var btnFragment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Message","onCreate")

        btnIntent=findViewById(R.id.btnIntent)
        btnFragment=findViewById(R.id.btnFragment)
        btnIntent.setOnClickListener{
            val intent= Intent(this@MainActivity,FirstActivity::class.java)
            startActivity(intent)
        }
        btnFragment.setOnClickListener {
            val intent = Intent(this,FragmentActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("Message","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message","onDestroy")
    }

}