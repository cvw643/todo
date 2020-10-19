package com.ibsettle.demo;

import com.ibsettle.demo.model.TodoTask;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@RequiredArgsConstructor
@Transactional
@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoTask create(TodoTask entity) {
        return todoRepository.save(entity);
    }

    @Transactional(readOnly = true)
    public Collection<TodoTask> getAll() {
        return todoRepository.findAll();
    }
}
