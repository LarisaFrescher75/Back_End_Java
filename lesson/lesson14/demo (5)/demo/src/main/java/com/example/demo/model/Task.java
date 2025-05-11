package com.example.demo.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter
public class Task {

    private Long id;
    private String description;
    private String priority;
}
