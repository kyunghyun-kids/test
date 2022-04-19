package com.example.todolist.repository

import com.example.todolist.domain.Todo
import org.springframework.data.repository.CrudRepository

interface TodoRepository : CrudRepository<Todo, Long>