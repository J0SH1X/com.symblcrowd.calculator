package com.symblcrowd.calculator

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import com.symblcrowd.calculator.databinding.ActivityMainBinding
import android.util.Log
import java.time.LocalDate

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
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
    private val inputList : ArrayList<Float> = arrayListOf<Float>()
    private val combinedList : ArrayList<Float> = arrayListOf<Float>()
    private val operatorList : MutableList<String> = arrayListOf<String>()
    private var numberIndex : Int = 0
    private var operatorIndex: Int = 0
    private var i : Int = 0
    private var inputDone : Int = 0
    private lateinit var operator : String
    private lateinit var combined : String
    private lateinit var oldcombined : String
    private var input : Int = 0
    private var p : Int = 2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        DisplayView = findViewById<TextView>(R.id.DisplayView)
        OneButton = findViewById<Button>(R.id.OneButton)
        TwoButton = findViewById<Button>(R.id.TwoButton)
        ThreeButton = findViewById<Button>(R.id.ThreeButton)
        FourButton = findViewById<Button>(R.id.FourButton)
        FiveButton = findViewById<Button>(R.id.FiveButton)
        SixButton = findViewById<Button>(R.id.SixButton)
        SevenButton = findViewById<Button>(R.id.SevenButton)
        EightButton = findViewById<Button>(R.id.EightButton)
        NineButton = findViewById<Button>(R.id.NineButton)
        ZeroButton = findViewById<Button>(R.id.ZeroButton)
        PlusButton = findViewById<Button>(R.id.PlusButton)
        MinusButton = findViewById<Button>(R.id.MinusButton)
        MultiplyButton = findViewById<Button>(R.id.MultiplyButton)
        DivideButton = findViewById<Button>(R.id.DivideButton)
        CommaButton = findViewById<Button>(R.id.CommaButton)
        BracesButton = findViewById<Button>(R.id.BracesButton)
        EqualButton = findViewById<Button>(R.id.EqualButton)



        OneButton.setOnClickListener {
            inputList.add(1F)
        }
        TwoButton.setOnClickListener {
            inputList.add(2F)
        }
        ThreeButton.setOnClickListener {
            inputList.add(3F)
        }
        FourButton.setOnClickListener {
            inputList.add(4F)
        }
        FiveButton.setOnClickListener {
            inputList.add(5F)
        }
        SixButton.setOnClickListener {
            inputList.add(6F)
        }
        SevenButton.setOnClickListener {
            inputList.add(7F)
        }
        EightButton.setOnClickListener {
            inputList.add(8F)
        }
        NineButton.setOnClickListener {
            inputList.add(9F)
        }
        ZeroButton.setOnClickListener {
            inputList.add(0F)
        }
        PlusButton.setOnClickListener {
            operatorList.add("+")
            Log.d("TAG", "SIZE OF InputArray ARRAY : " + inputList.size)
                CombineNumbers()
        }
        MinusButton.setOnClickListener {
            operatorList.add("-")
            CombineNumbers()
        }
        MultiplyButton.setOnClickListener {
            operatorList.add("*")
            CombineNumbers()
        }
        DivideButton.setOnClickListener {
            operatorList.add("/")
            CombineNumbers()
        }
        CommaButton.setOnClickListener {
            operatorList.add(",")
        }
        BracesButton.setOnClickListener {
            operatorList.add("()")
        }

        EqualButton.setOnClickListener {

            //todo parse operatormode and button aka combinedlist[0] then operatorlist[0]
            ParseOperator()

            while ( i < combinedList.size-1 && i < operatorList.size-1) {
                combinedList[numberIndex]
            }




        }

    }


    fun CombineNumbers() {
        while (i < inputList.size-1) {
                if (i == 0) {
                    combined =
                        inputList[numberIndex].toInt()
                            .toString() + inputList[numberIndex + 1].toInt()
                            .toString()
                    oldcombined = combined
                    i++

                } else {
                    Log.d("TAG", "P counter is : " + p)
                    combined = oldcombined + inputList[numberIndex + p].toInt().toString()
                    oldcombined = combined
                    i++
                    p++
                }
        }
        inputList.clear()
        i = 0
        Log.d("TAG", "Combined value is : " + combined)
    }

    fun ParseOperator() {
        if (operatorList[operatorIndex] == "+") {
            
        }

        if (operatorList[operatorIndex] == "-") {
        }


        if (operatorList[operatorIndex] == "*") {
        }


        if (operatorList[operatorIndex] == "/") {
        }

}

}
