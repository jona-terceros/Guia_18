package com.example.myapprecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UserActivity : AppCompatActivity() {
    lateinit var rvUser: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        rvUser = findViewById(R.id.rv_users)

        val list = arrayListOf<User>()
        list.add( User("Jonatan1", "jona123@gmail.com"))
        list.add( User("Jonatan1", "jona123@gmail.com"))
        list.add( User("Jonatan2", "jona122@gmail.com"))
        list.add( User("Jonatan3", "jona124@gmail.com"))
        list.add( User("Jonatan4", "jona125@gmail.com"))
        list.add( User("Jonatan5", "jona126@gmail.com"))
        list.add( User("Jonatan7", "jona125@gmail.com"))
        list.add( User("Jonatan8", "jona126@gmail.com"))
        list.add( User("Jonatan9", "jona126@gmail.com"))
        list.add( User("Jonatan10", "jona127@gmail.com"))

        val linearLayout = LinearLayoutManager(this)
        linearLayout.orientation = LinearLayoutManager.VERTICAL

        rvUser.layoutManager = linearLayout
        rvUser.adapter = UserAdapter(list, applicationContext)
    }
}