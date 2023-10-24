package com.hack.hacksa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.availableJobs)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = getAvailableJobs()

        val adapter = CompanyAdapter(data)
        recyclerView.adapter = adapter

    }
    fun getAvailableJobs(): List<Company> {
        return mutableListOf(
            Company(123, "Taco Cabana", 4.4, "Dishwasher"),
            Company(123, "Applebee's", 4.2, "Hostess"),
            Company(123, "Chili's", 4.5, "Bartender"),
            Company(123, "Cheddars", 4.8, "Hostess"),
            Company(123, "Dutchbros", 4.9, "Line busser"),
            Company(123, "Whataburger", 3.8, "Drive-Thru Attendant"),
            Company(123, "McDonalds", 4.2, "Cashier")
        )
    }
}