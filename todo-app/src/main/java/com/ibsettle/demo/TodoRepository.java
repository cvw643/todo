package com.ibsettle.demo;

import com.ibsettle.demo.model.TodoTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoTask, Integer> {
}
