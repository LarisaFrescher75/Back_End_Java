package de.ait.tasks.repository;

import de.ait.tasks.model.Priority;
import de.ait.tasks.model.Task;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class TaskRepositoryMapImpl implements TaskRepository {

    private final HashMap<Long, Task> map = new HashMap<>();
    private Long lastId = 5L;

    public TaskRepositoryMapImpl() {
        map.put(1L, new Task(1L,"title1" ,"Task 1", Priority.LOW));
        map.put(2L, new Task(2L, "title2","Task 2", Priority.HIGH));
        map.put(3L, new Task(3L, "title3","Task 3", Priority.LOW));
        map.put(4L, new Task(4L, "title4","Task 4", Priority.MEDIUM));
        map.put(5L, new Task(5L,"title5" ,"Task 5", Priority.LOW));
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



