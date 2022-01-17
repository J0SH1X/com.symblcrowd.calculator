package com.symblcrowd.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.symblcrowd.calculator.databinding.ActivityMainBinding
import android.util.Log

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var DisplayView : TextView
    private lateinit var TwoButton : Button
    private lateinit var OneButton : Button
    private lateinit var ThreeButton : Button
    private lateinit var FourButton : Button
    private lateinit var FiveButton : Button
    private lateinit var SixButton : Button
    private lateinit var SevenButton : Button
    private lateinit var EightButton : Button
    private lateinit var NineButton : Button
    private lateinit var ZeroButton : Button
    private lateinit var PlusButton : Button
    private lateinit var MinusButton : Button
    private lateinit var MultiplyButton : Button
    private lateinit var DivideButton : Button
    private lateinit var CommaButton : Button
    private lateinit var BracesButton : Button
    private lateinit var EqualButton : Button
    private lateinit var clearButton : Button
    private val inputList : ArrayList<String> = arrayListOf()
    private val combinedList : ArrayList<Float> = arrayListOf()
    private val operatorList : MutableList<String> = arrayListOf()
    private val solveList : MutableList<Float> = arrayListOf()
    private var oldsolve : MutableList<Float> = arrayListOf()
    private var numberIndex : Int = 0
    private var operatorIndex: Int = 0
    private var i : Int = 0
    private lateinit var combined : String
    private lateinit var oldcombined : String
    private var p : Int = 2
    private var c : Int = 0
    private lateinit var number : String
    private var clearButtonPressed : Int = 0
    private var isPointNumber = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        DisplayView = findViewById(R.id.DisplayView)
        OneButton = findViewById(R.id.OneButton)
        TwoButton = findViewById(R.id.TwoButton)
        ThreeButton = findViewById(R.id.ThreeButton)
        FourButton = findViewById(R.id.FourButton)
        FiveButton = findViewById(R.id.FiveButton)
        SixButton = findViewById(R.id.SixButton)
        SevenButton = findViewById(R.id.SevenButton)
        EightButton = findViewById(R.id.EightButton)
        NineButton = findViewById(R.id.NineButton)
        ZeroButton = findViewById(R.id.ZeroButton)
        PlusButton = findViewById(R.id.PlusButton)
        MinusButton = findViewById(R.id.MinusButton)
        MultiplyButton = findViewById(R.id.MultiplyButton)
        DivideButton = findViewById(R.id.DivideButton)
        CommaButton = findViewById(R.id.CommaButton)
        BracesButton = findViewById(R.id.BracesButton)
        EqualButton = findViewById(R.id.EqualButton)
        clearButton = findViewById(R.id.clearButton)



        OneButton.setOnClickListener {
            inputList.add("1")
            number = "1"
            displayInput ()
        }
        TwoButton.setOnClickListener {
            inputList.add("2")
            number = "2"
            displayInput ()
        }
        ThreeButton.setOnClickListener {
            inputList.add("3")
            number = "3"
            displayInput ()
        }
        FourButton.setOnClickListener {
            inputList.add("4")
            number = "4"
            displayInput ()
        }
        FiveButton.setOnClickListener {
            inputList.add("5")
            number = "5"
            displayInput ()
        }
        SixButton.setOnClickListener {
            inputList.add("6")
            number = "6"
            displayInput ()
        }
        SevenButton.setOnClickListener {
            inputList.add("7")
            number = "7"
            displayInput ()
        }
        EightButton.setOnClickListener {
            inputList.add("8")
            number = "8"
            displayInput ()
        }
        NineButton.setOnClickListener {
            inputList.add("9")
            number = "9"
            displayInput ()
        }
        ZeroButton.setOnClickListener {
            inputList.add("0")
            number = "0"
            displayInput ()
        }
        PlusButton.setOnClickListener {
            if (inputList.size > 0 || (oldsolve.isNotEmpty() && operatorList.size == 0)) {
                operatorList.add("+")
                DisplayView.append("+")
                combineNumbers()
            }

        }
        MinusButton.setOnClickListener {
            if (inputList.size > 0 || (oldsolve.isNotEmpty() && operatorList.size == 0)) {
                operatorList.add("-")
                DisplayView.append("-")
                combineNumbers()
            }
        }
        MultiplyButton.setOnClickListener {
            if (inputList.size > 0 || (oldsolve.isNotEmpty() && operatorList.size == 0)) {
                operatorList.add("*")
                DisplayView.append("*")
                combineNumbers()
            }
        }
        DivideButton.setOnClickListener {
            if (inputList.size > 0 || (oldsolve.isNotEmpty() && operatorList.size == 0)) {
                operatorList.add("/")
                DisplayView.append("/")
                combineNumbers()
            }
        }
        CommaButton.setOnClickListener {
            if (inputList[inputList.lastIndex] != "." && inputList.isNotEmpty()) {
                inputList.add(".")
                DisplayView.append(",")
                isPointNumber = true
            }
        }
        BracesButton.setOnClickListener {
            operatorList.add("()")
        }
        clearButton.setOnClickListener {
            inputList.clear()
            combinedList.clear()
            operatorList.clear()
            solveList.clear()
            oldsolve.clear()
            DisplayView.text = ""
            clearButtonPressed = 1
            p = 1
            isPointNumber = false
        }

        EqualButton.setOnClickListener {
            combineNumbers()
            parseOperator()
            // TODO this does not work
            Log.d("INFO", "Remainder is : " + solveList[0].rem(100.toFloat()))
            if (solveList[0].rem(100.toFloat()) == 0F) {
                DisplayView.text = solveList[0].toInt().toString()
            } else {
                DisplayView.text = solveList[0].toString()
            }
            inputList.clear()
            combinedList.clear()
            operatorList.clear()
            if (oldsolve.size == 0) {
                oldsolve.add(solveList[0])
            } else{
                oldsolve[0] = solveList[0]
        }
            solveList.clear()
        }

    }
    private fun combineNumbers() {
        i = 0
        if (inputList.size == 1) {
            if (oldsolve.size == 0) {
                oldcombined = inputList[0]
            }else {
                combinedList.clear()
                combinedList.add(oldsolve[0])
                oldcombined = inputList[0]
                combinedList.add(oldcombined.toFloat())
            }
        }else {
            if (inputList.contains(".") && p < inputList.size-1 && operatorList.size == 0 || isPointNumber == true && p < inputList.size-1) {
                p++
                }
            if (p == inputList.size){
                p--
            }
            while (i < inputList.size -1) {
                if (i == 0) {
                    combined =
                        inputList[numberIndex] + inputList[numberIndex + 1]
                    oldcombined = combined
                    i++

                } else {


                   /* if ((inputList.size >0 && isPointNumber == false) || clearButtonPressed == 0 && isPointNumber == false) {
                        p = 2
                        combined = oldcombined + inputList[numberIndex + p]
                    }else if( (inputList.size > 0 && isPointNumber == true) || clearButtonPressed == 1){
                        combined = oldcombined + inputList[numberIndex + p +1]
                        clearButtonPressed = 0
                    }*/

                    combined = oldcombined + inputList[numberIndex + p]


                    oldcombined = combined
                    i++
                    if (p < inputList.size - 1) {
                        p++
                    }
                }
            }
        }
        if (oldsolve.size == 0) {
            combinedList.add(oldcombined.toFloat())
        }else {
            combinedList.clear()
            combinedList.add(oldsolve[0])
            combinedList.add(oldcombined.toFloat())
        }
        inputList.clear()
    }

    private fun parseOperator() {
        operatorIndex = 0
        numberIndex = 0
        i = 0
        p = 1
        c = 0
        while (i < combinedList.size-1){
            when {
                operatorList[operatorIndex] == "+" -> {
                    if (i == 0) {
                        solveList.add(combinedList[numberIndex + c] + combinedList[numberIndex + p])
                    }else {
                        solveList[0] = (solveList[0] + combinedList[numberIndex + c + 1])
                    }
                }
                operatorList[operatorIndex] == "-" -> {
                    if (i == 0) {
                        solveList.add(combinedList[numberIndex + c] - combinedList[numberIndex + p])
                    }else {
                        solveList[0] = (solveList[0] - combinedList[numberIndex + c + 1])

                    }

                }
                operatorList[operatorIndex] == "*" -> {
                    if (i == 0) {
                        solveList.add(combinedList[numberIndex + c] * combinedList[numberIndex + p])
                    }else {
                        solveList[0] = (solveList[0] * combinedList[numberIndex + c + 1])

                    }
                }
                operatorList[operatorIndex] == "/" -> {
                    if (i == 0) {
                        solveList.add(combinedList[numberIndex + c] / combinedList[numberIndex + p])
                    }else {
                        solveList[0] = (solveList[0] / combinedList[numberIndex + c + 1])

                    }
                }
            }
            if (p < combinedList.size-1) {
                p++
            }
            i++
            if ( operatorIndex < operatorList.size-1) {
                operatorIndex++
            }
            if (c < combinedList.size-1) {
                c++
            }
        }
    }

    private fun displayInput () {
        if ( inputList.size == 0){
            DisplayView.text = number
        }else {
            DisplayView.append(number)
        }
    }

}