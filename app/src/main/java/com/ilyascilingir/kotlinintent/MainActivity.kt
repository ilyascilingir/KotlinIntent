package com.ilyascilingir.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ilyascilingir.kotlinintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun next (view : View) {

        val intent = Intent(applicationContext,NextActivity::class.java)
        intent.putExtra("username",binding.editTextUsername.text.toString())
        intent.putExtra("name",binding.editTextName.text.toString())
        startActivity(intent)
    }
}