package com.example.review_feb6_recording

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.Switch
import android.widget.Toast

const val LOG_TAG = "MainActivity"


class MainActivity : AppCompatActivity()
{
    private lateinit var myButton: Button
    private lateinit var myButton1: Button
    private lateinit var myButton2:Button
    private lateinit var switch: Switch
    private lateinit var seekBar: SeekBar


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myButton = findViewById(R.id.button)
        myButton1 = findViewById(R.id.button1)
        myButton2 = findViewById(R.id.button2)
        switch = findViewById(R.id.switch1)
        seekBar = findViewById(R.id.seekBar)


        myButton.setOnClickListener{view: View ->
           val btn = view as Button
            btn.text = getString(R.string.clicked)


           Log.i(LOG_TAG, " was called")
           Log.d(LOG_TAG, "this is a debug message")
            Toast.makeText(this,R.string.buttonClicked, Toast.LENGTH_SHORT).show()
        }


        val buttonListener = View.OnClickListener {
            val btn: Button = it as Button
            println("button clicked is ${btn.text}")

        }


        val buttonLong = View.OnLongClickListener {
            val btn = it as Button
            println("button clicked ${btn.text}")
            true
        }


        //myButton.setOnLongClickListener(buttonLong)
        //myButton1.setOnLongClickListener(buttonLong)
        //myButton2.setOnLongClickListener(buttonLong)

        myButton.setOnClickListener(buttonListener)
        myButton1.setOnClickListener(buttonListener)
        myButton2.setOnClickListener(buttonListener)


    }



}