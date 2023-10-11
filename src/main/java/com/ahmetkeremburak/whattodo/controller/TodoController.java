package com.ahmetkeremburak.whattodo.controller;

import com.ahmetkeremburak.whattodo.controller.dto.request.CreateTodoItem;
import com.ahmetkeremburak.whattodo.controller.dto.request.UpdateTodoItem;
import com.ahmetkeremburak.whattodo.controller.dto.response.ResponseTodoItem;
import com.ahmetkeremburak.whattodo.model.TodoState;
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

    @GetMapping(value = "/todo/{id}")
    public ResponseEntity<ResponseTodoItem> getTodoById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(service.getTodoById(id));
    }

    @GetMapping(value = "/todo/{state}")
    public ResponseEntity<List<ResponseTodoItem>> getTodoByState(@PathVariable(name = "state") TodoState state){
        return ResponseEntity.ok(service.getTodoByState(state));
    }

    @GetMapping(value = "/todo/{checked}")
    public ResponseEntity<List<ResponseTodoItem>> getTodoByChecked(@PathVariable(name = "checked") boolean checked){
        return ResponseEntity.ok(service.getTodoByChecked(checked));
    }

    @PutMapping(name = "/todo")
    public ResponseEntity<ResponseTodoItem> updateTodo(@RequestBody UpdateTodoItem todoItem){
        return ResponseEntity.ok(service.updateTodo(todoItem));
    }

    @DeleteMapping(name = "/todo")
    public ResponseEntity<?> deleteTodo(@RequestParam Long id){
        if(service.deleteTodoById(id)){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

}
