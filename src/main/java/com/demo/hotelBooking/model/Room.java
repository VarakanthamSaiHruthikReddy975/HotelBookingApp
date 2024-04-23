package com.demo.hotelBooking.model;

import com.demo.hotelBooking.enumFiles.roomType;
import com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "Rooms")
@Data
@Builder
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    @ManyToOne
    @JoinColumn(name="hotelId")
    private Hotel hotel;

    private String roomNumber;

    @Enumerated(EnumType.STRING)
    private roomType roomType;


}
