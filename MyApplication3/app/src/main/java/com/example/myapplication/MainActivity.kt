package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.EditText

const val EXTRA_MESS = "com.example.appenviatxt.message"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.etName)
        //findViewById: permite vincular coimponentes de la viosta con el codigo
        val message = editText.text.toString()
//Intent: ponemos el contexto , el nuevoa activitiy que se va a ir
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESS, message)//permite enviar informacion
        }
        startActivity(intent)
    }

}