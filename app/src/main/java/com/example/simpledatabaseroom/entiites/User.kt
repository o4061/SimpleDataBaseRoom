package com.example.simpledatabaseroom.entiites

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
)