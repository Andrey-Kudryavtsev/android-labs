package com.nsu.andrey.homework_1

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Homework-1", String.format("%s: onCreate", this.javaClass.simpleName))
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val spinner = findViewById<Spinner>(R.id.spinner_example)
        spinner.adapter =
            ArrayAdapter.createFromResource(this,
                R.array.spinner_array, android.R.layout.simple_spinner_item)
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
}