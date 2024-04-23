package com.demo.hotelBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "Bookings")
@Data
@Builder
public class Booking {
}
