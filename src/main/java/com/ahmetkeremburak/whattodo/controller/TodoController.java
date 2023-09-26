package com.ahmetkeremburak.whattodo.controller;

import com.ahmetkeremburak.whattodo.controller.dto.request.CreateTodoItem;
import com.ahmetkeremburak.whattodo.controller.dto.response.ResponseTodoItem;
import com.ahmetkeremburak.whattodo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService service;

    @PostMapping(value = "/todo")
    public ResponseEntity<ResponseTodoItem> createTodo(@RequestBody CreateTodoItem todoItem){
        return  ResponseEntity.status(HttpStatus.CREATED).body(service.createTodo(todoItem));
    }

    @GetMapping(value = "/todo")
    public ResponseEntity<List<ResponseTodoItem>> getAllTodo(){
        List<ResponseTodoItem> listTodo = service.getAllTodo();
        return ResponseEntity.ok(listTodo);
    }

}
