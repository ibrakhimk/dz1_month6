package com.example.dz1_month6

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.dz1_month6.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.etText2.setText(intent.getStringExtra("text1"))

        binding.btnSend2.setOnClickListener {
            val intent = Intent()
            intent.putExtra("text", binding.etText2.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}
//        val intent: Intent =
//            intent
//        val name = intent.getStringExtra("key")
//        binding.etText2.setText(name)
//        binding.btnSend2.setOnClickListener {
//            if (binding.etText2.text.toString() == "") {
//                Toast.makeText(this, "Поле не может быть пустым", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this, "С вторгого на первый", Toast.LENGTH_SHORT).show()
//                val questionIntent = Intent(
//                    this@MainActivity2,
//                    MainActivity::class.java
//                )
//                questionIntent.putExtra("key", binding.etText2.text.toString())
//                startActivityForResult(questionIntent, 2)
//            }
//        }
//    }
//}