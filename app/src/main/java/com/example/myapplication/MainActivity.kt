package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
   lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       var binding =  ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

    var btntoast = findViewById<Button>(R.id.btntoast)




        binding.btntoast.setOnClickListener{
            Toast.makeText(this, "hola soy toast", Toast.LENGTH_SHORT).show()
        }

        binding.btnmostrar.setOnClickListener {
            Snackbar.make(it, "hola soy nackbar",Snackbar.LENGTH_SHORT)
                .setAction("Cerrar"){

                }
                .show()
        }

    }
}