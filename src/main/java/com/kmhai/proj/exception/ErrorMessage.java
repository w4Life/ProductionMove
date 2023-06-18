package com.kmhai.proj.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessage {

    private int error;
    
    private String message;
}
