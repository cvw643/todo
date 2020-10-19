package com.ibsettle.demo.mapper;

import com.ibsettle.demo.api.TodoTaskDTO;
import com.ibsettle.demo.model.TodoTask;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Collection;

@Mapper
public interface TodoMapper {
    TodoMapper INSTANCE = Mappers.getMapper(TodoMapper.class);

    TodoTaskDTO toDTO(TodoTask entity);

    TodoTask toEntity(TodoTaskDTO task);

    Collection<TodoTaskDTO> toDTOs(Collection<TodoTask> all);
}
