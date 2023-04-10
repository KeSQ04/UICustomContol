package com.example.uicustomcontol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uicustomcontol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.title.setTitle("首页")
        binding.title.setEdit {
            Toast.makeText(this, "点击了编辑", Toast.LENGTH_LONG).show()
        }
    }
}