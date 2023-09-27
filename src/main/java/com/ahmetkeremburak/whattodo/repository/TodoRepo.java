package com.ahmetkeremburak.whattodo.repository;

import com.ahmetkeremburak.whattodo.model.TodoItem;
import com.ahmetkeremburak.whattodo.model.TodoState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends JpaRepository<TodoItem, Long> {
    List<TodoItem> findByTodoState(TodoState state);

    List<TodoItem> findByIsChecked(boolean checked);
}
