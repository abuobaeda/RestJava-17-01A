package com.example.rest;

import java.util.concurrent.CopyOnWriteArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CustomerController {
    
    private final CopyOnWriteArrayList<Customer> cList = MockCustomerList.getInstance();
    
    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    public ResponseEntity<?> myError(Exception exception) {
        return new ResponseEntity<>(new JsonError("ID not found error:", exception.getMessage()), HttpStatus.NOT_FOUND);
    }
}
