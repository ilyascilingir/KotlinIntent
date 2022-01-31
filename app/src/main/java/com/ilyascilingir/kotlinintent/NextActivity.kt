package com.ilyascilingir.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ilyascilingir.kotlinintent.databinding.ActivityMainBinding
import com.ilyascilingir.kotlinintent.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //get intent
        val intent = intent
        val username = intent.getStringExtra("username")
        val name = intent.getStringExtra("name")

        binding.textViewUsername.text = "Username : " + username
        binding.textViewName.text = "Name : " + name
    }
}