package de.ait.tasks.controller;

import de.ait.tasks.dto.TaskResponseDto;
import de.ait.tasks.model.Task;
import de.ait.tasks.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return taskService.getAllTasks();

    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable("id") Long taskId) {
        return taskService.getTaskById(taskId);
    }

    @PostMapping("/tasks")
    public Task createNewTask(@RequestBody TaskResponseDto taskDto) {
        return taskService.createTask(taskDto);
    }

    @DeleteMapping("/tasks/{id}")
    public Task deleteTaskById(@PathVariable("id") Long id) {
        return taskService.deleteTask(id);
    }
}

