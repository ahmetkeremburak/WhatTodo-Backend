package com.ahmetkeremburak.whattodo.repository;

import com.ahmetkeremburak.whattodo.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<TodoItem, Long> {

}
