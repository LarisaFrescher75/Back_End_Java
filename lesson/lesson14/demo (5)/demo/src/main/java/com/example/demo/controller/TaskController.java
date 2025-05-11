package com.example.demo.controller;


import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }
    // Получаем все задачи
    @GetMapping
    public List<Task> getAllTasks() {
        return repository.findAll();
    }
    // Получаем задачу по ID
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Task task = repository.findById(id);
        return task != null ? ResponseEntity.ok(task) : ResponseEntity.notFound().build();
    }

    // Создаем новую задачу
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return repository.save(task);
    }

    // Удаляем задачу по ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        boolean deleted = repository.delete(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }




}
