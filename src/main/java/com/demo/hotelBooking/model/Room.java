package com.demo.hotelBooking.model;

import com.demo.hotelBooking.enumFiles.bedType;
import com.demo.hotelBooking.enumFiles.roomType;
import com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Entity
@Table(name = "Rooms")
@Data
@Builder
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotBlank
    @NotNull
    private Long Id;

    @ManyToOne
    @JoinColumn(name="hotelId")
    @NotBlank
    @NotNull
    private Hotel hotel;

    @NotBlank
    @NotNull
    private String roomNumber;

    @Enumerated(EnumType.STRING)
    @NotBlank
    @NotNull
    private roomType roomType;

    @Enumerated(EnumType.STRING)
    @NotBlank
    @NotNull
    private bedType bedType;

    @NotBlank
    @NotNull
    private Integer maxOccupancy;

    @NotBlank
    @NotNull
    private Double rate;

    @NotBlank
    @NotNull
    private boolean availability;


    public Room(Long id, Hotel hotel, String roomNumber, com.demo.hotelBooking.enumFiles.roomType roomType, com.demo.hotelBooking.enumFiles.bedType bedType, Integer maxOccupancy, Double rate, boolean availability) {
        Id = id;
        this.hotel = hotel;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.bedType = bedType;
        this.maxOccupancy = maxOccupancy;
        this.rate = rate;
        this.availability = availability;
    }

    public Room() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return availability == room.availability && Id.equals(room.Id) && hotel.equals(room.hotel) && roomNumber.equals(room.roomNumber) && roomType == room.roomType && bedType == room.bedType && maxOccupancy.equals(room.maxOccupancy) && rate.equals(room.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, hotel, roomNumber, roomType, bedType, maxOccupancy, rate, availability);
    }
}
