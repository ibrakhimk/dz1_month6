package com.example.dz1_month6

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.dz1_month6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val launcher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result ->
            if (result.resultCode == Activity.RESULT_OK && result.data != null) {
                val text =result.data?.getStringExtra("text")
                binding.etText.setText(text)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSend.setOnClickListener {
            if (binding.etText.text.isEmpty()){
                Toast.makeText(this, "Поле не может быть пустым!", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, MainActivity2:: class.java)
                intent.putExtra("text1", binding.etText.text.toString())
                setResult(Activity.RESULT_OK, intent)
                launcher.launch(intent)
            }
        }
    }
}