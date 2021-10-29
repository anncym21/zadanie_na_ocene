package com.example.zadanieee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import android.widget.ImageView
import com.example.zadanieee.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        var krolik = true
        val imageView = findViewById<ImageView>(id.imageView)
        imageView?.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "You clicked ImageView", Toast.LENGTH_SHORT
            ).show()
            if(krolik==true){
                imageButton.setImageDrawable(R.drawable.krolik3)
                krolik=false
            }else{
                krolik = true
                imageButton.setImageDrawable(R.drawable.krolik4)
            }
        }

    }
}