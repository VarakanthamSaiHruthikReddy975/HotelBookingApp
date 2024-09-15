package com.demo.hotelBooking.exception;

public class InvalidInputException extends RuntimeException{

    public InvalidInputException(String message){
        super("Invalid Input: Please enter the right input and try again");
    }
}
