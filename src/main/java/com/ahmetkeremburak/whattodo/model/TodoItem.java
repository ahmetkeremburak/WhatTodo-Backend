package com.ahmetkeremburak.whattodo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String Task;

    @Column(nullable = false)
    private boolean isChecked;
}
