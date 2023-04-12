package com.example.uicustomcontol

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uicustomcontol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var num = 0
    private var KEY_num = "KEY_num"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        num = getSharedPreferences("data", Context.MODE_PRIVATE).getInt(KEY_num, 0)
        show()

        binding.title.setTitle("首页")
        binding.title.setEdit {
            Toast.makeText(this, "点击了编辑", Toast.LENGTH_LONG).show()
        }

        binding.btnAdd.setOnClickListener {
            num++
            show()
        }
        binding.btnSubtract.setOnClickListener {
            num--
            show()
        }
    }

    private fun Save() =
        getSharedPreferences("data", Context.MODE_PRIVATE).edit().apply { putInt(KEY_num, num) }
            .apply()

    private fun show() {
        Save()
        binding.textnum.text = num.toString()
    }
}