package com.example.rest;

public class NotFoundException extends RuntimeException {
    /*
    * Create a HTTP 404
    */
    public NotFoundException(String Message){
        super(Message);
    }
}
