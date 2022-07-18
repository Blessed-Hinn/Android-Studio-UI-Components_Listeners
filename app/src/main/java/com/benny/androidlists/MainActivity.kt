package com.benny.androidlists

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myListView: ListView = findViewById(R.id.listCities)

        val cities = arrayOf(
            "Nairobi",
            "Cape Town",
            "Mombasa",
            "Kisumu",
            "Cairo",
            "Bujumbura",
            "Kigali",
            "Dodoma",
            "Kampala",
            "Tunis",
            "Lusaka",
            "Eritrea",
            "Brussels",
            "London",
            "Berlin"
        )
        Log.d("_CITIES","You have ${cities.size} cities")


        //Adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cities)

        //tell the list which adapter to use
        myListView.adapter = adapter

        //Attaching a listener

        myListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
                val city = cities[position]
            Toast.makeText(this, city, Toast.LENGTH_SHORT).show()
            Log.d("_CITIES","City that was clicked is $position")
            Log.d("_CITIES","Position is $position")

            val intent = Intent(this, SecondActivity::class.java)
            //pass data Between activities
            intent.putExtra("Name", city)
            intent.putExtra("Position", position)
            //Open the Activity
            startActivity(intent)


        }
    }
}
