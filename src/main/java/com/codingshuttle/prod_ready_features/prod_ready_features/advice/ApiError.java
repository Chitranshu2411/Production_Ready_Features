package com.codingshuttle.prod_ready_features.prod_ready_features.advice;

import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

public class ApiError {

    private LocalDateTime timeStamp;
    private String error;
    private HttpStatus statusCode;

    public ApiError() {
        this.timeStamp = LocalDateTime.now();
    }

    public ApiError(HttpStatus statusCode, LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
        this.statusCode = statusCode;
    }

    public ApiError(String localizedMessage, HttpStatus httpStatus) {
        this.error = localizedMessage;
        this.statusCode = httpStatus;
        this.timeStamp = LocalDateTime.now();
    }

    // getters
    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getError() {
        return error;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    // setters
    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }
}