package com.example.demo.repository;


import com.example.demo.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TaskRepository {

    private final Map<Long, Task> taskMap = new HashMap<>();
    private long currentId = 1;

    public List<Task> findAll() {
        return new ArrayList<>(taskMap.values());
    }

    public Task findById(Long id) {
        return taskMap.get(id);
    }

    public Task save(Task task) {
        task.setId(currentId++);
        taskMap.put(task.getId(), task);
        return task;
    }

    public boolean delete(Long id) {
        return taskMap.remove(id) != null;
    }
}
