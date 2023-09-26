package com.ahmetkeremburak.whattodo.configuration.modelconverter;

import com.ahmetkeremburak.whattodo.controller.dto.request.CreateTodoItem;
import com.ahmetkeremburak.whattodo.controller.dto.response.ResponseTodoItem;
import com.ahmetkeremburak.whattodo.model.TodoItem;
import com.ahmetkeremburak.whattodo.model.TodoState;

public class Converters {

    public static ResponseTodoItem todoItemToResponseItem(TodoItem todoItem){
        ResponseTodoItem respTodo= new ResponseTodoItem();
        respTodo.setId(todoItem.getId());
        respTodo.setChecked(todoItem.isChecked());
        respTodo.setTask(todoItem.getTask());
        respTodo.setTodoState(todoItem.getTodoState());

        return respTodo;
    }

    public static TodoItem createItemToTodoItem(CreateTodoItem createTodoItem){
        TodoItem todo = new TodoItem();
        todo.setTask(createTodoItem.getTask());
        todo.setTodoState(TodoState.PRESENT);
        todo.setChecked(false);

        return todo;
    }
}
