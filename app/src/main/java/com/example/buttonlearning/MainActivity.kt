package com.example.buttonlearning

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.buttonlearning.Calculator.Calculator
import com.example.buttonlearning.Dice.Dice
import com.example.buttonlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets }

        binding.btnCalc.setOnClickListener{
            val newIntent = Intent(this, Calculator::class.java)
            startActivity(newIntent)
        }
        binding.btnDice.setOnClickListener{
            val newIntent = Intent(this, Dice::class.java)
            startActivity(newIntent)
        }

    }
}
