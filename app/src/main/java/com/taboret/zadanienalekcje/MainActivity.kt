package com.taboret.zadanienalekcje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dopisz = findViewById<Button>(R.id.button)
        val przywroc = findViewById<Button>(R.id.button2)
        val tekst = findViewById<TextView>(R.id.textView)
        val wpisz = findViewById<EditText>(R.id.edittext)
 dopisz.setOnClickListener {
     tekst.text = tekst.text.toString() + wpisz.text
 }
        przywroc.setOnClickListener {
            tekst.text = "Julian Stajnke"
        }
    }
}