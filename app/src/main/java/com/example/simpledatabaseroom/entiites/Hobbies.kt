package com.example.simpledatabaseroom.entiites

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Hobbies(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val firstName: String,
    val lastName: String,
    val hobby: String
)
