package com.ahmetkeremburak.whattodo.service;

import com.ahmetkeremburak.whattodo.controller.dto.request.CreateTodoItem;
import com.ahmetkeremburak.whattodo.controller.dto.request.UpdateTodoItem;
import com.ahmetkeremburak.whattodo.controller.dto.response.ResponseTodoItem;
import com.ahmetkeremburak.whattodo.model.TodoState;

import java.util.List;

public interface TodoAbstractService {
    ResponseTodoItem createTodo(CreateTodoItem createTodoItem);
    ResponseTodoItem getTodoById(Long id);
    List<ResponseTodoItem> getTodoByState(TodoState state);
    List<ResponseTodoItem> getTodoByChecked(boolean checked);
    List<ResponseTodoItem> getAllTodo();
    ResponseTodoItem updateTodo(UpdateTodoItem todoItem);
    boolean deleteTodoById(Long id);



}
