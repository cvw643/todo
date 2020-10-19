package com.ibsettle.demo;

import com.ibsettle.demo.api.TodoTaskDTO;
import com.ibsettle.demo.mapper.TodoMapper;
import com.ibsettle.demo.model.TodoTask;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/tasks")
public class TodoController {
    private final TodoService todoService;

    @PostMapping
    public TodoTaskDTO create(@Valid @RequestBody TodoTaskDTO task) {
        TodoTask entity = todoService.create(TodoMapper.INSTANCE.toEntity(task));
        return TodoMapper.INSTANCE.toDTO(entity);
    }

    @GetMapping
    public Collection<TodoTaskDTO> getAll() {
        Collection<TodoTask> all = todoService.getAll();
        return TodoMapper.INSTANCE.toDTOs(all);
    }
}
