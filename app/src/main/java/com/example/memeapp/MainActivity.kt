package com.example.memeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageDiwali: ImageView = findViewById(R.id.imageView)
        var x = 1
        thread(start = true) {
            while (x > 0) {
                Thread.sleep(3000)
                runOnUiThread {
                    when (x) {
                        1 -> imageDiwali.setImageResource(R.drawable.meme2)
                        2 -> imageDiwali.setImageResource(R.drawable.meme3)
                        3 -> imageDiwali.setImageResource(R.drawable.meme4)
                        4 -> imageDiwali.setImageResource(R.drawable.meme5)
                        5 -> imageDiwali.setImageResource(R.drawable.meme6)
                        6 -> imageDiwali.setImageResource(R.drawable.meme7)
                        7 -> imageDiwali.setImageResource(R.drawable.meme8)
                        8 -> imageDiwali.setImageResource(R.drawable.meme9)
                        9 -> imageDiwali.setImageResource(R.drawable.meme10)
                        10 -> imageDiwali.setImageResource(R.drawable.meme11)
                        11 -> imageDiwali.setImageResource(R.drawable.meme12)
                        12 -> imageDiwali.setImageResource(R.drawable.meme13)
                        13 -> imageDiwali.setImageResource(R.drawable.meme14)
                        14 -> imageDiwali.setImageResource(R.drawable.meme15)
                        15 -> imageDiwali.setImageResource(R.drawable.meme16)
                        16 -> imageDiwali.setImageResource(R.drawable.meme17)
                        17 -> imageDiwali.setImageResource(R.drawable.meme18)
                        18 -> imageDiwali.setImageResource(R.drawable.meme19)
                        19 -> imageDiwali.setImageResource(R.drawable.meme20)
                    }
                    if (x == 19) x = 0
                }
                x++
            }
        }
    }
}
