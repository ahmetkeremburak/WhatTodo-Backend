package com.ahmetkeremburak.whattodo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "todoitems")
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String task;

    @Column(nullable = false)
    private boolean checked;

    @Enumerated(EnumType.STRING)
    private TodoState todoState;
}
