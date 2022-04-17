package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.rutinario.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configuracion(

        )
    }
    fun access(access: View){
        val intent = Intent(this, Home::class.java)
        startActivity(intent)

    }
    fun configuracion(
    )
    {
        /*acceso.set poner boton acceso a la escucha*/

    }
}