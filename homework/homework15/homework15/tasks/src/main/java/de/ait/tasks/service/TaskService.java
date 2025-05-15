package de.ait.tasks.service;

import de.ait.tasks.dto.TaskResponseDto;
import de.ait.tasks.model.Task;
import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task createTask(TaskResponseDto dto);
    Task deleteTask(Long id);
}
