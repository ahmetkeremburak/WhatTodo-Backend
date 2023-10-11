package com.ahmetkeremburak.whattodo.controller.dto.response;

import com.ahmetkeremburak.whattodo.model.TodoState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTodoItem{

    private Long id;
    private String Task;
    private boolean checked;
    private TodoState todoState;
}
