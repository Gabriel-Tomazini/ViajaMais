package com.example.viaja.data.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "travels")
data class Travel(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val userId: Int,
    val destination: String,
    val travelType: String,
    val startDate: String,
    val endDate: String,
    val budget: Double
)