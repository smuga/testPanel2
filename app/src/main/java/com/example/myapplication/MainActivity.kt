package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.ui.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        beginTransaction()
    }

    private fun beginTransaction() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.vgFragmentContent, MainFragment())
            .addToBackStack(MainFragment.IDENT)
            .commit()
    }
}
