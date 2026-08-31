package com.example.linearlayout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtNumber.text = number.toString()

        binding.btnCount.setOnClickListener {
            number++
            binding.txtNumber.text = number.toString()
        }

        binding.btnToast.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Count $number",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}