package com.hack.hacksa

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    var companyNames = mutableListOf("Taco Cabana", "Applebee's", "Chili's", "Cheddars", "Dutchbros", "Whataburger", "McDonald's")
    var companyRankings = mutableListOf(4.4, 4.2, 4.5, 4.8, 4.9, 3.8, 4.2)
    var companyRoleDescriptions = mutableListOf("Dishwasher", "Hostess", "Bartender", "Hostess", "Linebusser", "Drive-Thru Attendant", "Cashier")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.availableJobs)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Company>()

        for (i in 0..6) {
            data.add(Company(R.drawable.ic_launcher_foreground, companyNames[i], companyRankings[i], companyRoleDescriptions[i]))
        }

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
