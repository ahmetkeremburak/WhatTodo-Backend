package com.ahmetkeremburak.whattodo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Task;

    private boolean isChecked;
}
