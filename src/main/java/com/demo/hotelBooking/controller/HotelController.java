package com.demo.hotelBooking.controller;

import com.demo.hotelBooking.model.Hotel;
import com.demo.hotelBooking.serviceInterface.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/hotel")
public class HotelController {
    private final HotelService hotelService;

    @GetMapping("/allHotels")
    public ResponseEntity<List<Hotel>> getAllHotels(){
        return ResponseEntity.ok(hotelService.getAllHotels());
    }
    @GetMapping("/hotelByID/{id}")
    public ResponseEntity<Optional<Hotel>> getHotelByID(Long id){
        return ResponseEntity.ok(hotelService.getHotelById(id));
    }

    @PostMapping("/addHotel")
    public ResponseEntity<Optional<Hotel>> addHotel(@RequestBody Hotel hotel){
        Optional<Hotel> addedHotel = hotelService.addHotel(hotel);
        return ResponseEntity.ok(addedHotel);
    }


}
