package com.benny.androidlists

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val firstText: TextView = findViewById(R.id.textFirst)
        val secondText: TextView = findViewById(R.id.txtName)

        /*val font = ResourcesCompat.getFont(this, R.font.static)
        firstText.typeface = font
        secondText.typeface = font
*/
        val intent: Intent = intent
        val nameCity = intent.getStringExtra("Name")
        val positionCity = intent.getIntExtra("Position", 0)

        firstText.text = nameCity
        secondText.text = positionCity.toString()

        val actionBar = supportActionBar
        actionBar!!.title = nameCity
    }
}