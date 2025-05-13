package de.ait.tasks.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
public class Programmer {
    @Setter
    private Long id;

    @Setter
    private String name;

    @Setter
    private String email;

    private Set<Task> tasks = new HashSet<>();

    public Programmer(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
}

