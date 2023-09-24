package com.ahmetkeremburak.whattodo.controller.dto.request;

import com.ahmetkeremburak.whattodo.model.TodoState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTodoItem {
    private Long id;
    private String task;
    private boolean isChecked;
    private TodoState todoState;
}
