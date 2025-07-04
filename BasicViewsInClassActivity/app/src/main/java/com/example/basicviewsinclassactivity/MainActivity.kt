package com.example.basicviewsinclassactivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val diceResult = findViewById<TextView>(R.id.diceResult)

        rollButton.setOnClickListener {
            val result = Random.nextInt(1, 7)
            diceResult.text = getString(R.string.dice_result_text, result)
        }
        }
    }
}
