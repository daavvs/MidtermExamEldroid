package com.brigoli.animal.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class MangeBlockActivity : AppCompatActivity() {

    private lateinit var blockedAnimalsListView: ListView
    private lateinit var unblockButton: Button

    private val blockedAnimals: MutableList<Animal> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mange_block)

        // Initialize views and populate the list of blocked animals
        blockedAnimalsListView = findViewById(R.id.blockedAnimalsListView)
        unblockButton = findViewById(R.id.unblockButton)

        // Set up the adapter for the ListView
        val adapter = AnimalAdapter(blockedAnimals)
        blockedAnimalsListView.adapter = adapter

        unblockButton.setOnClickListener {
            // Implement logic to unblock the selected animal
            // Update SharedPreferences
            // Update the list of blocked animals
            // Update AnimalNamesActivity when you go back
        }

    }
}