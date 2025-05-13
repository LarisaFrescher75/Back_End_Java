package de.ait.tasks.service;

import de.ait.tasks.dto.TaskCreateDto;
import de.ait.tasks.model.Task;
import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task createTask(TaskCreateDto dto);
    Task deleteTask(Long id);
}
