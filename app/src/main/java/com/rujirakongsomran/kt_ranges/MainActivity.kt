package com.rujirakongsomran.kt_ranges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlayString.setOnClickListener {
            // Range examples
            for (i in 1..10) // Result 1,2,3,4,5,6,7,8,9,10
                Log.d("LOOP", "" + i)

            for (i in 1..4) // Result 1,2,3,4
                Log.d("TAG", i.toString())

            for (i in 4 downTo 1) // Result 4,3,2,1
                Log.d("DOWN TO", i.toString())

            for (i in 10 downTo 1 step 2) // Result 10,8,6,4,2
                Log.d("STEP", i.toString())

            for (i in 1 until 10) // 1,2,3,4,5,6,7,8,9
                Log.d("UNTIL", i.toString())
        }
    }
}