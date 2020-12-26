package com.example.simpledatabaseroom.entiites.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.simpledatabaseroom.entiites.Hobbies
import com.example.simpledatabaseroom.entiites.User

data class UserAndHobbies(
    @Embedded val user: User,
    @Relation(
        parentColumn = "id",
        entityColumn = "id"
    )
    val hobbies: Hobbies
)