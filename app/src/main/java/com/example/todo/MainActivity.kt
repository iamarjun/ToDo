package com.example.todo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val taskList: List<Task> = listOf(
        Task(1, "Buy Milk", "4L", "02/11/2019"),
        Task(1, "Buy M", "4Ldadadas", "02/11/2019"),
        Task(1, "Buy ilk", "4Ldadads", "02/11/2019"),
        Task(1, "Buy lk", "4L", "02/11/2019"),
        Task(1, "Buy Milk", "4Ldadgg", "02/11/2019"),
        Task(1, "Buy ilk", "4L", "02/11/2019"),
        Task(1, "Buy ilk", "4Lggg", "02/11/2019"),
        Task(1, "Buy Mlk", "4Lgg", "02/11/2019")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab_add_task.setOnClickListener {
            addTask()
        }

        setupTaskList()


    }


    private fun setupTaskList() {
        val staggeredGridLayoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        task_list.layoutManager = staggeredGridLayoutManager

        task_list.adapter = TaskAdapter(taskList)
    }

    private fun addTask() {
        startActivity(Intent(this, AddNote::class.java))
    }
}
