package com.example.myapprecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle
import kotlinx.coroutines.NonDisposableHandle.parent

class UserAdapter(val list: ArrayList<User>, val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false)
        return UserListViewHolder(view)
    }
    class UserListViewHolder(view: View) : RecyclerView.ViewHolder(view)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list.get(position)
        holder.itemView.findViewById<TextView>(R.id.txtName).text = item.name
        holder.itemView.findViewById<TextView>(R.id.txtEmail).text = item.email

    }

    override fun getItemCount(): Int {
        return list.size
    }




}
