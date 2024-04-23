package com.demo.hotelBooking.model;

import com.demo.hotelBooking.enumFiles.statusOfConfirmation;
import com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "Bookings")
@Data
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotBlank
    @NotNull
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "roomId")
    @NotBlank
    @NotNull
    private Room room;

    @ManyToOne
    @JoinColumn(name = "guestId")
    @NotBlank
    @NotNull
    private Guest guest;

    @NotBlank
    @NotNull
    private LocalDateTime checkIn;

    @NotBlank
    @NotNull
    private LocalDateTime checkOut;

    @NotBlank
    @NotNull
    @DecimalMin("0.0")
    @DecimalMax("30000.0")
    private Double totalCost;

    @NotNull
    @NotBlank
    private statusOfConfirmation statusOfConfirmation;

    public Booking(Long bookingId, Room room, Guest guest, LocalDateTime checkIn, LocalDateTime checkOut, Double totalCost, com.demo.hotelBooking.enumFiles.statusOfConfirmation statusOfConfirmation) {
        this.bookingId = bookingId;
        this.room = room;
        this.guest = guest;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.totalCost = totalCost;
        this.statusOfConfirmation = statusOfConfirmation;
    }

    public Booking() {
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public com.demo.hotelBooking.enumFiles.statusOfConfirmation getStatusOfConfirmation() {
        return statusOfConfirmation;
    }

    public void setStatusOfConfirmation(com.demo.hotelBooking.enumFiles.statusOfConfirmation statusOfConfirmation) {
        this.statusOfConfirmation = statusOfConfirmation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return bookingId.equals(booking.bookingId) && room.equals(booking.room) && guest.equals(booking.guest) && checkIn.equals(booking.checkIn) && checkOut.equals(booking.checkOut) && totalCost.equals(booking.totalCost) && statusOfConfirmation == booking.statusOfConfirmation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, room, guest, checkIn, checkOut, totalCost, statusOfConfirmation);
    }
}
