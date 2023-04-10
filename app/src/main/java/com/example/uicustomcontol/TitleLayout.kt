package com.example.uicustomcontol

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.uicustomcontol.databinding.TitleBinding

class TitleLayout(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {
    private lateinit var binding: TitleBinding

    init {
        //动态加载布局
        LayoutInflater.from(context).inflate(R.layout.title, this)
        binding = TitleBinding.bind(this)

        binding.btnReturn.setOnClickListener {
            val a = context as Activity
            a.finish()
        }
    }

    public fun setTitle(title: String) {
        binding.textTitle.text = title
    }

    public fun setEdit(click: OnClickListener) {
        binding.btnEdit.setOnClickListener(click)
    }
}