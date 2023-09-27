package com.ahmetkeremburak.whattodo.service;


import com.ahmetkeremburak.whattodo.controller.dto.request.CreateTodoItem;
import com.ahmetkeremburak.whattodo.controller.dto.request.UpdateTodoItem;
import com.ahmetkeremburak.whattodo.controller.dto.response.ResponseTodoItem;
import com.ahmetkeremburak.whattodo.model.TodoItem;
import com.ahmetkeremburak.whattodo.model.TodoState;
import com.ahmetkeremburak.whattodo.repository.TodoRepo;
import com.ahmetkeremburak.whattodo.configuration.modelconverter.Converters;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoService implements TodoAbstractService {
    private final TodoRepo repo;
    @Override
    public ResponseTodoItem createTodo(CreateTodoItem todoItem) {
//        Converters at work
        TodoItem todo = Converters.createItemToTodoItem(todoItem);
        todo = repo.save(todo);

//      a model mapper would be nice / Nvm, written my own converter
        ResponseTodoItem respTodo= Converters.todoItemToResponseItem(todo);
        return respTodo;
    }

    @Override
    public List<ResponseTodoItem> getAllTodo() {
        List<TodoItem> rawList = repo.findAll(Sort.by("id").ascending());
        List<ResponseTodoItem> respList = rawList.stream()
                .map(Converters::todoItemToResponseItem)
                .collect(Collectors.toList());
        return respList;
    }

    @Override
    public ResponseTodoItem getTodoById(Long id) {
        TodoItem todoItem = repo.getReferenceById(id);
        ResponseTodoItem respTodoItem = Converters.todoItemToResponseItem(todoItem);
        return respTodoItem;
    }

    @Override
    public List<ResponseTodoItem> getTodoByState(TodoState state) {
        List<TodoItem> todoItems = repo.findByTodoState(state);
        List<ResponseTodoItem> responseTodoItems = todoItems.stream()
                .map(Converters::todoItemToResponseItem)
                .collect(Collectors.toList());
        return responseTodoItems;
    }

    @Override
    public List<ResponseTodoItem> getTodoByChecked(boolean checked) {
        return null;
    }



    @Override
    public ResponseTodoItem updateTodo(UpdateTodoItem todoItem) {
        return null;
    }

    @Override
    public boolean deleteTodoById(Long id) {
        return false;
    }
}
