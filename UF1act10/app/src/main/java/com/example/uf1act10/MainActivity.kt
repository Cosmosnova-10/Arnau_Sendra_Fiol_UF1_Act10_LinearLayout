package com.example.uf1act10

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
import com.google.android.material.textfield.TextInputEditText
/*
Crear una pantalla de registre on l’usuari indicarà el seu nom, cognom,edat, usuari i password amb
un botó en la part inferior amb el text enviar, que simplement mostri un toast dient registre
complet per pantalla. Per contenir els elements fes servir un LinearLayout. Realitza un altre versió
d’aquesta pantalla però ara fent servir un Relative Layout i un Constraint Layout.
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editTextNom = findViewById<EditText>(R.id.editTextText)
        val editTextCognom = findViewById<EditText>(R.id.editTextText2)
        val editNumberEdat = findViewById<EditText>(R.id.editTextNumberDecimal)
        val editTextUsuari = findViewById<EditText>(R.id.editTextText3)
        val passwordAuthentication = findViewById<EditText>(R.id.editTextTextPassword)

        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener {

            if(editTextNom.text.isNotBlank() && editTextCognom.text.isNotBlank() && editNumberEdat.text.isNotBlank() && editTextUsuari.text.isNotBlank() && passwordAuthentication.text.isNotBlank()) {
                //val text = editTextNom.text.toString()
                //val text2 = editTextCognom.text.toString()
                //val text3 = editNumberEdat.text.toString()
                Toast.makeText(this, "Registre Complet", Toast.LENGTH_SHORT).show()
                //Log.d("InputType", text2)

            }else {

                Toast.makeText(this, "No s'han omplert tots els camps", Toast.LENGTH_SHORT).show()
            }
        }





    }
}