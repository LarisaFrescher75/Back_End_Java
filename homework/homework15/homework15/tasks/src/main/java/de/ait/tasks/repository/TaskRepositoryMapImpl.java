package de.ait.tasks.repository;

import de.ait.tasks.model.Priority;
import de.ait.tasks.model.Task;
import de.ait.tasks.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class TaskRepositoryMapImpl implements TaskRepository {

    private final HashMap<Long, Task> map = new HashMap<>();
    private Long lastId = 5L;

    public TaskRepositoryMapImpl() {
        map.put(1L, new Task(1L, "Task 1", Priority.LOW));
        map.put(2L, new Task(2L, "Task 2", Priority.HIGH));
        map.put(3L, new Task(3L, "Task 3", Priority.LOW));
        map.put(4L, new Task(4L, "Task 4", Priority.MEDIUM)); // исправлено
        map.put(5L, new Task(5L, "Task 5", Priority.LOW));
    }

    @Override
    public List<Task> findAll() {
        return map.values().stream().toList();
    }

    @Override
    public Task findById(Long id) {
        if (!map.containsKey(id)) {
            throw new RuntimeException("Task with id " + id + " not found");
        }
        return map.get(id);
    }

    @Override
    public Task delete(Long id) {
        return map.remove(id);
    }

    @Override
    public Task save(Task task) {
        task.setId(++lastId);
        map.put(lastId, task);
        return task;
    }
}



