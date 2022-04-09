package com.example.diceapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val did: Button = findViewById(R.id.button)
        did.setOnClickListener {
           rollDice()
        }
    }
    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
    private fun rollDice() {

            val dice = Dice(6)
            val diceRoll = dice.roll()
             val diceimage: ImageView =findViewById(R.id.imageView)
     val imagevalue=when(diceRoll){
         1 -> R.drawable.dice_1
         2 -> R.drawable.dice_2
         3 -> R.drawable.dice_3
         4 -> R.drawable.dice_4
         5 -> R.drawable.dice_5
         else -> R.drawable.dice_6
     }
        diceimage.setImageResource(imagevalue)
        }
    }
