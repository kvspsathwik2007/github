package com.example.module_1casestudyhellovariations

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.btnLinear).setOnClickListener {
            startActivity(Intent(this, LinearActivity::class.java))
        }

        findViewById<Button>(R.id.btnRelative).setOnClickListener {
            startActivity(Intent(this, RelativeActivity::class.java))
        }

        findViewById<Button>(R.id.btnConstraint).setOnClickListener {
            startActivity(Intent(this, ConstraintActivity::class.java))
        }
    }
}