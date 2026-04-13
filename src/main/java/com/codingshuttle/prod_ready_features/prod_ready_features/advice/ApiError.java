package com.codingshuttle.prod_ready_features.prod_ready_features.advice;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ApiError {
    private LocalDateTime timeStamp;
    private String error;
    private HttpStatus statusCode;


    public ApiError() {
        this.timeStamp = LocalDateTime.now();
    }

    public ApiError(HttpStatus statusCode, LocalDateTime timeStamp) {
        this();
        this.statusCode = statusCode;
        this.timeStamp = timeStamp;
    }

    public ApiError(String localizedMessage, HttpStatus httpStatus) {
        this.error = localizedMessage;
        this.statusCode = httpStatus;
        this.timeStamp = LocalDateTime.now();
    }
}