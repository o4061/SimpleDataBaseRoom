package com.example.simpledatabaseroom

import androidx.room.*
import com.example.simpledatabaseroom.entiites.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

    @Query("SELECT id, firstName, lastName, age FROM user_table WHERE id = :id")
    suspend fun selectUserWithId(id: Int): User

    @Query("SELECT * FROM user_table")
    suspend fun readAllData(): List<User>

    @Query("DELETE FROM user_table")
    suspend fun deleteAll()

    @Query("DELETE FROM user_table WHERE id = :id")
    suspend fun deleteUserWithId(id : Int)


}