package com.nsu.andrey.homework_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Homework-1", String.format("%s: onCreate", this.javaClass.simpleName))
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.i("Homework-1", String.format("%s: onStart", this.javaClass.simpleName))
        super.onStart()
    }

    override fun onResume() {
        Log.i("Homework-1", String.format("%s: onResume", this.javaClass.simpleName))
        super.onResume()
    }

    override fun onPause() {
        Log.i("Homework-1", String.format("%s: onPause", this.javaClass.simpleName))
        super.onPause()
    }

    override fun onStop() {
        Log.i("Homework-1", String.format("%s: onStop", this.javaClass.simpleName))
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Homework-1", String.format("%s: onDestroy", this.javaClass.simpleName))
        super.onDestroy()
    }

    override fun onRestart() {
        Log.i("Homework-1", String.format("%s: onRestart", this.javaClass.simpleName))
        super.onRestart()
    }

    fun clickOnButton(view: View) {
        startActivity(Intent(this, ListActivity::class.java))
    }
}