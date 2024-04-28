package com.demo.hotelBooking.service;

import com.demo.hotelBooking.model.Hotel;
import com.demo.hotelBooking.repository.HotelRepository;
import com.demo.hotelBooking.serviceInterface.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    public List<Hotel> getAllHotels(){
        List<Hotel> allHotels = hotelRepository.findAll();

        return allHotels;
    }

    public Optional<Hotel> getHotelById(Long hotelId){
        Optional<Hotel> hotel = hotelRepository.findById(hotelId);
        return hotel;
    }

    public Optional<Hotel> addHotel(Hotel hotel){
       return Optional.of(hotelRepository.save(hotel));
    }

    public Optional<Hotel> updateHotelById(Long hotelId, Hotel updatedHotel) {
        return hotelRepository.findById(hotelId)
                .map(existingHotel -> {
                    Hotel updatedHotelEntity = Hotel.builder()
                            .hotelId(existingHotel.getHotelId())
                            .name(updatedHotel.getName() != null ? updatedHotel.getName() : existingHotel.getName())
                            .address(updatedHotel.getAddress() != null ? updatedHotel.getAddress() : existingHotel.getAddress())
                            // Update other fields as needed
                            .build();
                    return hotelRepository.save(updatedHotelEntity);
                });
    }
}
