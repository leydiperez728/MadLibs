package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        Story_id.setOnClickListener { view ->
            }
        }
    fun openthirdActivity() {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }
}