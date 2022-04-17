package com.example

interface ListaTareas {
    fun rellenarLista():MutableList<String>{
        return mutableListOf(
                "Desayuno",
                "Vestimenta",
                "Aseo",
                "Deberes",
                "Recogida de habitación",
                "Comida",
                "Cena"
        )

    }
}