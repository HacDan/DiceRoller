package org.hacdan.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btnRoll)
        val diceValueTV: TextView = findViewById(R.id.tvDiceRoll)

        rollButton.setOnClickListener{
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
            diceValueTV.setText(diceRoll().toString())
        }


    }

    fun diceRoll(): Int {
        return (1..6).random()
    }
}