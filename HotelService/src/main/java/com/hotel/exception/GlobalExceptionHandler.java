package com.hotel.exception;


import com.hotel.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {


     @ExceptionHandler(ResourceNotFound.class)
     public ResponseEntity<Map<String,Object>> resourceNotFound(ResourceNotFound ex){
       Map<String,Object> map = new HashMap<>();
       map.put("message",ex.getMessage());
       map.put("success",false);
       map.put("statuscode",HttpStatus.NOT_FOUND);
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);

     }
}
