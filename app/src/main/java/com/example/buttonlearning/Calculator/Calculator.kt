package com.example.buttonlearning.Calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.buttonlearning.R
import com.example.buttonlearning.databinding.ActivityCalculatorBinding


class Calculator : AppCompatActivity() , View.OnClickListener {
    private lateinit var binding: ActivityCalculatorBinding

    lateinit var firstNrText : EditText
    lateinit var secondNrText : EditText
    lateinit var answerView : TextView
    lateinit var Add : Button
    lateinit var Sub : Button
    lateinit var Multi : Button
    lateinit var Div : Button
    lateinit var Clr : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firstNrText = findViewById(R.id.firstEditText)
        secondNrText = findViewById(R.id.secondEditText)
        answerView = findViewById(R.id.answerText)
        Add = findViewById(R.id.btnAdd)
        Sub = findViewById(R.id.btnSub)
        Multi = findViewById(R.id.btnMulti)
        Div = findViewById(R.id.btnDiv)
        Clr = findViewById(R.id.btnClear)

        Add.setOnClickListener(this)
        Sub.setOnClickListener(this)
        Multi.setOnClickListener(this)
        Div.setOnClickListener(this)
        Clr.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a = firstNrText.text.toString().toDouble()
        var b = secondNrText.text.toString().toDouble()
        var answer = 0.0

        when(v?.id){
            R.id.btnAdd -> {answer = a + b}
            R.id.btnSub -> {answer = a - b}
            R.id.btnMulti -> {answer = a * b}
            R.id.btnDiv -> {answer = a / b}
            R.id.btnClear -> {firstNrText.text.clear()
                secondNrText.text.clear()}
        }
        answerView.text = "Answer is: $answer"
    }

}