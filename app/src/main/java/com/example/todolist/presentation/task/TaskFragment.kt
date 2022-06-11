package com.example.todolist.presentation.task

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.todolist.R
import com.example.todolist.databinding.FragmentTasksBinding

class TaskFragment : Fragment(R.layout.fragment_tasks) {
    private lateinit var binding: FragmentTasksBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}