package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Tap button
        findViewById<Button>(R.id.button).setOnClickListener{
            //handle button tap
            Log.i("Margarito", "Tapped on Button")
            //Reference
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.maroon))
        }
    }
}