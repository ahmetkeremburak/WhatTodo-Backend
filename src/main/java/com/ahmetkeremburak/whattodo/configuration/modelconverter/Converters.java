package com.ahmetkeremburak.whattodo.configuration.modelconverter;

import com.ahmetkeremburak.whattodo.controller.dto.response.ResponseTodoItem;
import com.ahmetkeremburak.whattodo.model.TodoItem;

public class Converters {

    public static ResponseTodoItem todoItemToResponseItem(TodoItem todoItem){
        ResponseTodoItem respTodo= new ResponseTodoItem();
        respTodo.setId(todoItem.getId());
        respTodo.setChecked(todoItem.isChecked());
        respTodo.setTask(todoItem.getTask());
        respTodo.setTodoState(todoItem.getTodoState());

        return respTodo;
    }
}
