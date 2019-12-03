package com.example.gradleproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.gradleproject.databinding.ActivityMainBinding
import com.example.myjoke.MyClass
import com.example.myandroidlibrary.ImageActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        binding.myButton.setOnClickListener { tellJoke() }
    }

    fun tellJoke() {
        val joke = MyClass()
        val intent = Intent(this, ImageActivity::class.java)
        intent.putExtra("JOKE", joke.joke)
        startActivity(intent)
//        Toast.makeText(this, joke.joke, Toast.LENGTH_SHORT).show()
    }
}
