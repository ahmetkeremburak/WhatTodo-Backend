package com.ahmetkeremburak.whattodo.service;

import com.ahmetkeremburak.whattodo.controller.dto.request.UpdateTodoItem;
import com.ahmetkeremburak.whattodo.controller.dto.response.ResponseTodoItem;

public interface TodoAbstractService {
    ResponseTodoItem createTodo(String task);
    ResponseTodoItem getTodoById(Long id);
    ResponseTodoItem getAllTodo();
    ResponseTodoItem updateTodo(UpdateTodoItem todoItem);


}
