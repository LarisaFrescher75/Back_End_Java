package com.example.demo.repository;


import com.example.demo.model.Task;

import java.util.HashMap;
import java.util.List;

public class TaskDB extends TaskRepository {
    private static final HashMap<Long, Task> map = new HashMap<>();

    static {
        map.put(1L, new Task(1L, "Task1", "Description1"));
        map.put(2L, new Task(2L, "Task2", "Description2"));
        map.put(3L, new Task(3L, "Task3", "Description3"));
        map.put(4L, new Task(4L, "Task4", "Description4"));
        map.put(5L, new Task(5L, "Task5", "Description5"));
        map.put(6L, new Task(6L, "Task6", "Description6"));
        map.put(7L, new Task(7L, "Task7", "Description7"));

    }

    public List<Task> findAll() {
        return map.values().stream().toList();
    }


    public Task findById(Long id) {
        return map.get(id);
    }


    @Override
    public Task save(Task task) {
        map.put(task.getId(), task);
        return task;
    }


}