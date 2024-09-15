package com.demo.hotelBooking.exception;


public class BookingUnavailableException extends RuntimeException{
    public BookingUnavailableException(String message){
        super("The current booking you are looking for is currently unavailable, please choose other options and try again");
    }

}
