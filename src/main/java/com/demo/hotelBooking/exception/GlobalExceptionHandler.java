package com.demo.hotelBooking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        return new ResponseEntity<>(resourceNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BookingUnavailableException.class)
    public ResponseEntity<String> handleBookingNotFoundException(BookingUnavailableException bookingUnavailableException){
        return new ResponseEntity<>(bookingUnavailableException.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidInputException.class)
    public ResponseEntity<String> handleInvalidInputException(InvalidInputException invalidInputException){
        return new ResponseEntity<>(invalidInputException.getMessage(),HttpStatus.NOT_FOUND);
    }
}
