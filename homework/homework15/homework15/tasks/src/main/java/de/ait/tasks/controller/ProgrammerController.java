package de.ait.tasks.controller;

import de.ait.tasks.dto.ProgrammerCreateDto;
import de.ait.tasks.model.Programmer;
import de.ait.tasks.model.Task;
import de.ait.tasks.service.ProgrammerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProgrammerController {

    private final ProgrammerService programmerService;

    @GetMapping("/programmers")
    public List<Programmer> getProgrammers() {
        return programmerService.getAllProgrammers();
    }

    @GetMapping("/programmers/{id}")
    public Programmer getProgrammerById(@PathVariable("id") Long id) {
        return programmerService.getProgrammerById(id);
    }

    @GetMapping("/programmers/{id}/tasks")
    public List<Task> getTaskByProgrammer(@PathVariable("id") Long id) {
        return programmerService.getTasksByProgrammerId(id);
    }

    @PutMapping("/programmers/{programmerId}/tasks/{taskId}")
    public void addTaskToProgrammer(@PathVariable Long programmerId, @PathVariable Long taskId) {
        programmerService.addTaskToProgrammer(programmerId, taskId);
    }

    @PostMapping("/programmers")
    public Programmer createProgrammer(@RequestBody ProgrammerCreateDto dto) {
        return programmerService.createProgrammer(dto);
    }
}

