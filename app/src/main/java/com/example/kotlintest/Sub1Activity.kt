package com.example.kotlintest

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Sub1Activity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_sub1);
        Toast.makeText(applicationContext, (outval+""),Toast.LENGTH_LONG).show();
    }
}