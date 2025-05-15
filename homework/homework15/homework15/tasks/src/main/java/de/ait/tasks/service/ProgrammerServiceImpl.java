package de.ait.tasks.service;

import de.ait.tasks.dto.ProgrammerResponseDto;
import de.ait.tasks.model.Programmer;
import de.ait.tasks.model.Task;
import de.ait.tasks.repository.ProgrammerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProgrammerServiceImpl implements ProgrammerService {

    private final ProgrammerRepository repository;

    @Override
    public List<Programmer> getAllProgrammers() {
        return repository.findAll();
    }

    @Override
    public Programmer getProgrammerById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Task> getTasksByProgrammerId(Long id) {
        return repository.findTasksByProgrammerId(id);
    }

    @Override
    public void addTaskToProgrammer(Long programmerId, Long taskId) {
        repository.addTaskToProgrammer(programmerId, taskId);
    }

    @Override
    public Programmer createProgrammer(ProgrammerResponseDto dto) {
        Programmer programmer = new Programmer(null, dto.getName(), dto.getEmail());
        return repository.save(programmer);
    }
}

