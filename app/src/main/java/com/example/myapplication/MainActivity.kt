package com.example.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Almacenamos un componente del xml. Encontramos nuestro elemento con el comando find y la siguiente estructura
        //Con la instruccion hemos identificado el cuadro de texto
        val edad: EditText=findViewById(R.id.editTextText2)
        val boton:Button=findViewById(R.id.button)
        val salidaTexto:TextView=findViewById(R.id.textView)

        //Ponemos el botón a la escucha de un evento
        boton.setOnClickListener(){
            //Almacenamos el numero introducido por el usuario
            //Es un texto introducido que se convierte en entero o en nulo


            val numeroResultado=edad.text.toString().toIntOrNull()

            if(numeroResultado==null) salidaTexto.text="Introduce una edad"
            else if(numeroResultado<18 && numeroResultado>0) salidaTexto.text="Eres menor de edad"
            else if(numeroResultado>=18 && numeroResultado<120) salidaTexto.text="Eres mayor de edad"



        }
    }


}