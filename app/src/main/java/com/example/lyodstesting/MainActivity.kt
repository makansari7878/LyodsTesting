package com.example.lyodstesting

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var submitButton = findViewById<Button>(R.id.buttonSubmit)
        val usernameEditText = findViewById<EditText>(R.id.editTextUsername)
        var usernameTextView = findViewById<TextView>(R.id.textViewUsername)


        submitButton.setOnClickListener {
            var username = usernameEditText.text.toString()
            Toast.makeText(this, "Username is $username", Toast.LENGTH_LONG).show()
            usernameTextView.setText(username)

        }
    }
}