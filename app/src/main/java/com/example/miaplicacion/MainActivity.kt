package com.example.miaplicacion

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMensaje = findViewById<Button>(R.id.btnMensaje)

        btnMensaje.setOnClickListener {
            Toast.makeText(
                this,
                "¡Bienvenida a mi práctica!",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}