package com.demo.hotelBooking.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message){
        super("The resource you are looking for is not found or has restricted access");
    }
}
