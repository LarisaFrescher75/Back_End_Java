package de.ait.tasks.model;

import lombok.*;

//@AllArgsConstructor
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = "id")

public class Task {

    @Setter
    private Long id;
    private String title;
    private String description;
    private Priority priority;


    public Task(Long id, String title, String description, Priority priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority= priority;
    }



}



