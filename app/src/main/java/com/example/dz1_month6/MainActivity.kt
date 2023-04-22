package com.example.dz1_month6

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dz1_month6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent: Intent =
            intent
        var name = intent.getStringExtra("key")
        binding.etText.setText(name)
        binding.btnSend.setOnClickListener {
            if (binding.etText.text.toString() == "") {
                Toast.makeText(this, "Поле не может быть пустым", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "С первого на второй", Toast.LENGTH_SHORT).show()
                val questionIntent = Intent(
                    this@MainActivity,
                    MainActivity2::class.java
                )
                questionIntent.putExtra("key", binding.etText.text.toString())
                startActivityForResult(questionIntent, 2)
            }
        }
    }
}