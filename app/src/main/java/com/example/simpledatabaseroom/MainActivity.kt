package com.example.simpledatabaseroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.example.simpledatabaseroom.entiites.User
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dao = UserDatabase.getInstance(this).userDao()
        var listOfUsers : List<User>? = null
        var user1 : User

        val users = listOf(
            User(0,"maria", "xristopoulou", 23),
            User(0,"nikos", "marinos", 43),
            User(0,"drosos", "makris", 33),
            User(0,"mike", "zabidis", 27),
        )



        lifecycleScope.launch {
            //users.forEach { dao.addUser(it) }
        }
    }
}