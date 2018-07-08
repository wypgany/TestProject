package com.example.wyp.testproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view: View = Button(this)
        view.showOff()
        Log.d("aaa", "Develop's second commit")
        Log.d("aaa", "Develop's third commit")
        Log.d("aaa", "Develop's forth commit")
        Log.d("aaa", "Develop's fifth commit")
        Log.d("bbb", "Develop's first commit")
        Log.d("bbb", "Develop's second commit")
    }


}

fun View.showOff() = Log.d("aaa", "I'm a View")
fun Button.showOff() = Log.d("aaa", "I'm a Button")
