package com.example.guesstowin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var random = Random.nextInt(1,1000)
    var guess = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun pressbutton (view: View){
        guess= Integer.parseInt(editText.getText().toString())
        if (guess == random){
            result.text = "Congrats"
        }
        else if (guess < random){
            result.text = " Higher"
        }
        else {
            result.text = "Lower"
        }

    }

}