package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            //STEP 1
        //**Create instance of the fragment class
val frag1=Fragment1()
        val frag2=Fragment2()
            //STEP2
        //Access button to change views
        val button1=findViewById<Button>(R.id.button1)
        //Access fragContainer
        //step3 begin Transactionn of fragments
        //we need to assign a default view to the fragment container which will always be displayed
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragContainer,frag2)
            commit()
        }
//buttonClick
        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragContainer,frag1)

            }
        }


    }
}