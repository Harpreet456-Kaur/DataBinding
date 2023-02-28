package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.intValue = 0
        binding.activity = this
    }

    fun onPlusClick(){
        value++
        binding.intValue = value
        binding.tvNum.text=binding.intValue.toString()
    }
    fun onMinusClick() {
        value--
        binding.intValue = value
        binding.tvNum.text=binding.intValue.toString()
    }
    fun onResetClick() {
        value = 0
        binding.intValue=0
        binding.tvNum.text=binding.intValue.toString()
    }
}