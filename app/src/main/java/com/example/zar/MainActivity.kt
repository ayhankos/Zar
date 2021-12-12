package com.example.zar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var image : ImageView
    lateinit var button : Button
    lateinit var text : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById<ImageView>(R.id.imageView)
        button = findViewById<Button>(R.id.button)
        text = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            Toast.makeText(this, "Button tıklandı.", Toast.LENGTH_LONG).show()

            randomSayiUret()
        }
    }
    fun randomSayiUret(){
        Log.d("Ayhan","randomSayiUret fonksiyonu çalıştı")
        var randomSayi = (1..6).random()

        zariGoster(randomSayi)
    }

    fun zariGoster(number:Int){
        when(number){
            1 -> image.setImageResource(R.drawable.dice_1)
            2 -> image.setImageResource(R.drawable.dice_2)
            3 -> image.setImageResource(R.drawable.dice_3)
            4 -> image.setImageResource(R.drawable.dice_4)
            5 -> image.setImageResource(R.drawable.dice_5)
            6 -> image.setImageResource(R.drawable.dice_6)
        }
    }
}