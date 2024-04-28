package com.demo.hotelBooking.serviceInterface;

import com.demo.hotelBooking.model.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {
    public List<Hotel> getAllHotels();
    public Optional<Hotel> getHotelById(Long hotelId);

    public Optional<Hotel> addHotel(Hotel hotel);

    public Optional<Hotel> updateHotelById(Long hotelId, Hotel updatedHotel);
}
