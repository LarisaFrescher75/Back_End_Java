package de.ait.tasks.service;

import de.ait.tasks.dto.TaskCreateDto;
import de.ait.tasks.model.Task;
import de.ait.tasks.repository.TaskRepository;
import jakarta.annotation.Priority;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository repository;

    @Override
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return repository.findById(id);
                //.orElseThrow(() -> new RuntimeException("Task not found"));
    }

    @Override
    public Task createTask(TaskCreateDto dto) {
        Task task = new Task(null, dto.getTitle(), dto.getDescription(), dto.getPriority());
        return repository.save(task);
    }

    @Override
    public Task deleteTask(Long id) {
        Task task = getTaskById(id);
        repository.delete(id);
        return task;
    }
}

