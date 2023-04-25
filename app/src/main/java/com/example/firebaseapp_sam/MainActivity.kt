package com.example.firebaseapp_sam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var editdata:EditText
    private lateinit var buttonsave:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editdata = findViewById(R.id.edtdata)
        buttonsave = findViewById(R.id.btnsave)

        var database = FirebaseDatabase.getInstance()
        var databaseRef = database.reference


        buttonsave.setOnClickListener {

            var user_data = editdata.text.toString().trim()

            databaseRef.setValue(user_data)

            //Toast.makeText(this, user_data, Toast.LENGTH_SHORT).show()

        }
    }
}