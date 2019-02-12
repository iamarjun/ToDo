package com.example.todo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.layout_task.view.*

class TaskAdapter(private val taskList: List<Task>): RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {


    interface ClickListeners {
        fun onLongClickListener()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): TaskViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.layout_task, p0, false)

        return TaskViewHolder(view)
    }

    override fun getItemCount(): Int = taskList.size

    override fun onBindViewHolder(p0: TaskViewHolder, p1: Int) {

        p0.mTitle.text = taskList[p1].title
        p0.mMessage.text = taskList[p1].message

    }


    inner class TaskViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

        val mTitle = view.title
        val mMessage = view.message

    }
}