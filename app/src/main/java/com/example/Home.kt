package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.rutinario.R

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
    fun pulsaSiguiente(access: View){
        val intentLista = Intent (this, Routines::class.java)
        startActivity(intentLista)

    }

    fun accesoLista(access: View){
        val intentAcceso = Intent (this, RoutineList::class.java)
        startActivity(intentAcceso)

    }



}