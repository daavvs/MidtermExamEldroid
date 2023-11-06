package com.brigoli.animal.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AnimalNamesActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AnimalAdapter
    private val animals: MutableList<Animal> = mutableListOf(
        Animal("Fox", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Dog", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Cat", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Bee", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Ant", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Eel", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Zebra", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Yak", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Whale", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Snail", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Rat", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Parrot", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Lion", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),
        Animal("Goat", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eleifend ex at pharetra iaculis. Mauris auctor dolor ligula, rutrum suscipit diam luctus ut. Praesent tempor tortor non elit luctus pellentesque. Suspendisse imperdiet sapien ut nisi ultricies, sit amet maximus ipsum vulputate. Mauris a nisi ipsum. Cras scelerisque est ut lorem laoreet, a luctus nisl lacinia. Phasellus vestibulum dui nec massa volutpat, at ultrices metus tincidunt.", false),

    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_names)

        // Initialize the RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Create and set the adapter
        adapter = AnimalAdapter(animals)
        recyclerView.adapter = adapter(this)


}

    private fun adapter(animalNamesActivity: AnimalNamesActivity): RecyclerView.Adapter<RecyclerView.ViewHolder>? {

        return TODO("Provide the return value")
    }


}
