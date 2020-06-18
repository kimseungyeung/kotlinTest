package com.example.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
val outval="1";
class MainActivity : AppCompatActivity() {
  val value1  ="111";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,value1,Toast.LENGTH_LONG).show();

    }

}
