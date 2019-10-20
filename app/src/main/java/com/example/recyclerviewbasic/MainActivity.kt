package com.example.recyclerviewbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewbasic.model.Person

class MainActivity : AppCompatActivity() {

    lateinit var persons: ArrayList<Person>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        persons = ArrayList()
        persons.add(Person("Whistle", R.drawable.creature_app_whistle_1))
        persons.add(Person("Bear", R.drawable.creature_bear_sleepy))
        persons.add(Person("Bird Blue", R.drawable.creature_bird_blue_fly_1))
        persons.add(Person("Bug Insect", R.drawable.creature_bug_insect_happy))
        persons.add(Person("Bug Spider", R.drawable.creature_bug_spider))
        persons.add(Person("Cat Derp", R.drawable.creature_cat_derp))
        persons.add(Person("Cow", R.drawable.creature_cow_01))
        persons.add(Person("Dino", R.drawable.creature_dino_01))
        persons.add(Person("Dog", R.drawable.creature_dog_bone))
        persons.add(Person("Duck Yello", R.drawable.creature_duck_yellow_1))
        persons.add(Person("Frog", R.drawable.creature_frog_hungry))
        persons.add(Person("Head Fox", R.drawable.creature_head_fox))
    }
}
