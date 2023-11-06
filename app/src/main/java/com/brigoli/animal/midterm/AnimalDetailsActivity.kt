package com.brigoli.animal.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AnimalDetailsActivity : AppCompatActivity() {

    private lateinit var animalNameTextView: TextView
    private lateinit var animalDescriptionTextView: TextView
    private lateinit var blockAnimalButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_details)




        var Animal = intent.getSerializableExtra("animal") as Animal


        animalNameTextView = findViewById(R.id.animalNameTextView)
        animalDescriptionTextView = findViewById(R.id.animalDescriptionTextView)
        blockAnimalButton = findViewById(R.id.blockAnimalButton)

        animalNameTextView.text = Animal.name
        animalDescriptionTextView.text = Animal.description

        blockAnimalButton.setOnClickListener {

        }
    }
}