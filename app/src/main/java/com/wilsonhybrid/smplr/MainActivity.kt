package com.wilsonhybrid.smplr

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener {


    override fun onLongClick(v: View?): Boolean {
        when (v!!.id) {
            R.id.button1 -> {
                Toast.makeText(applicationContext,"You long pressed Kick",Toast.LENGTH_LONG).show()
            }
            R.id.button2 -> {
                Toast.makeText(applicationContext,"You long pressed Snare",Toast.LENGTH_LONG).show()
            }
            R.id.button3 -> {
                Toast.makeText(applicationContext,"You long pressed HHC",Toast.LENGTH_LONG).show()
            }
            R.id.button4 -> {
                Toast.makeText(applicationContext,"You long pressed HHO",Toast.LENGTH_LONG).show()
            }
            R.id.button5 -> {
                Toast.makeText(applicationContext,"You long pressed Tom1",Toast.LENGTH_LONG).show()
            }
            R.id.button6 -> {
                Toast.makeText(applicationContext,"You long pressed Tom2",Toast.LENGTH_LONG).show()
            }
            R.id.button7 -> {
                Toast.makeText(applicationContext,"You long pressed Tom3",Toast.LENGTH_LONG).show()
            }
            R.id.button8 -> {
                Toast.makeText(applicationContext,"You long pressed Tom4",Toast.LENGTH_LONG).show()
            }
            R.id.button9 -> {
                Toast.makeText(applicationContext,"You long pressed Crash1",Toast.LENGTH_LONG).show()
            }
            R.id.button10 -> {
                Toast.makeText(applicationContext,"You long pressed Crash2",Toast.LENGTH_LONG).show()
            }
            R.id.button11 -> {
                Toast.makeText(applicationContext,"You long pressed Splash",Toast.LENGTH_LONG).show()
            }
            R.id.button12 -> {
                Toast.makeText(applicationContext,"You long pressed Ride",Toast.LENGTH_LONG).show()
            }
            R.id.button13 -> {
                Toast.makeText(applicationContext,"You long pressed misc 1",Toast.LENGTH_LONG).show()
            }
            R.id.button14 -> {
                Toast.makeText(applicationContext,"You long pressed misc 2",Toast.LENGTH_LONG).show()
            }
            R.id.button15 -> {
                Toast.makeText(applicationContext,"You long pressed misc 3",Toast.LENGTH_LONG).show()
            }
            R.id.button16 -> {
                Toast.makeText(applicationContext,"You long pressed misc 4",Toast.LENGTH_LONG).show()
            }
        }
        return true
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.button1 -> {
                Toast.makeText(applicationContext,"You pressed Kick",Toast.LENGTH_LONG).show()
            }
            R.id.button2 -> {
                Toast.makeText(applicationContext,"You pressed Snare",Toast.LENGTH_LONG).show()
            }
            R.id.button3 -> {
                Toast.makeText(applicationContext,"You pressed HHC",Toast.LENGTH_LONG).show()
            }
            R.id.button4 -> {
                Toast.makeText(applicationContext,"You pressed HHO",Toast.LENGTH_LONG).show()
            }
            R.id.button5 -> {
                Toast.makeText(applicationContext,"You pressed Tom1",Toast.LENGTH_LONG).show()
            }
            R.id.button6 -> {
                Toast.makeText(applicationContext,"You pressed Tom2",Toast.LENGTH_LONG).show()
            }
            R.id.button7 -> {
                Toast.makeText(applicationContext,"You pressed Tom3",Toast.LENGTH_LONG).show()
            }
            R.id.button8 -> {
                Toast.makeText(applicationContext,"You pressed Tom4",Toast.LENGTH_LONG).show()
            }
            R.id.button9 -> {
                Toast.makeText(applicationContext,"You pressed Crash1",Toast.LENGTH_LONG).show()
            }
            R.id.button10 -> {
                Toast.makeText(applicationContext,"You pressed Crash2",Toast.LENGTH_LONG).show()
            }
            R.id.button11 -> {
                Toast.makeText(applicationContext,"You pressed Splash",Toast.LENGTH_LONG).show()
            }
            R.id.button12 -> {
                Toast.makeText(applicationContext,"You pressed Ride",Toast.LENGTH_LONG).show()
            }
            R.id.button13 -> {
                Toast.makeText(applicationContext,"You pressed misc 1",Toast.LENGTH_LONG).show()
            }
            R.id.button14 -> {
                Toast.makeText(applicationContext,"You pressed misc 2",Toast.LENGTH_LONG).show()
            }
            R.id.button15 -> {
                Toast.makeText(applicationContext,"You pressed misc 3",Toast.LENGTH_LONG).show()
            }
            R.id.button16 -> {
                Toast.makeText(applicationContext,"You pressed misc 4",Toast.LENGTH_LONG).show()
            }
        }
    }

   

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1:Button = findViewById(R.id.button1)
        val button2:Button = findViewById(R.id.button2)
         val button3:Button = findViewById(R.id.button3)
         val button4:Button = findViewById(R.id.button4)
         val button5:Button = findViewById(R.id.button5)
         val button6:Button = findViewById(R.id.button6)
         val button7:Button = findViewById(R.id.button7)
         val button8:Button = findViewById(R.id.button8)
         val button9:Button = findViewById(R.id.button9)
         val button10:Button = findViewById(R.id.button10)
         val button11:Button = findViewById(R.id.button11)
         val button12:Button = findViewById(R.id.button12)
         val button13:Button = findViewById(R.id.button13)
         val button14:Button = findViewById(R.id.button14)
         val button15:Button = findViewById(R.id.button15)
         val button16:Button = findViewById(R.id.button16)
        
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        button10.setOnClickListener(this)
        button11.setOnClickListener(this)
        button12.setOnClickListener(this)
        button13.setOnClickListener(this)
        button14.setOnClickListener(this)
        button15.setOnClickListener(this)
        button16.setOnClickListener(this)

        button1.setOnLongClickListener(this)
        button2.setOnLongClickListener(this)
        button3.setOnLongClickListener(this)
        button4.setOnLongClickListener(this)
        button5.setOnLongClickListener(this)
        button6.setOnLongClickListener(this)
        button7.setOnLongClickListener(this)
        button8.setOnLongClickListener(this)
        button9.setOnLongClickListener(this)
        button10.setOnLongClickListener(this)
        button11.setOnLongClickListener(this)
        button12.setOnLongClickListener(this)
        button13.setOnLongClickListener(this)
        button14.setOnLongClickListener(this)
        button15.setOnLongClickListener(this)
        button16.setOnLongClickListener(this)

    }


}
