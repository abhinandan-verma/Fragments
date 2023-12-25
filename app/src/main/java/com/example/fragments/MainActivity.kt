package com.example.fragments

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)

        btn1.setOnClickListener {
            val fragment1 : Fragment = Fragment1()

            val f_trans : FragmentTransaction =
                        supportFragmentManager.beginTransaction()

            f_trans.replace(R.id.fragment1, fragment1).commit()
        }

        btn2.setOnClickListener {
            val fragment2 : Fragment = Fragment2()

            val f_trans : FragmentTransaction =
                    supportFragmentManager.beginTransaction()

            f_trans.replace(R.id.fragment1, fragment2).commit()
        }
    }
}