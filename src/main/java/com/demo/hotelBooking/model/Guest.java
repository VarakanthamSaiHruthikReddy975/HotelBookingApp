package com.demo.hotelBooking.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Entity
@Table(name = "Guest")
@Data
@Builder
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotBlank
    @NotNull
    private Long guestId;

    @ManyToOne
    @JoinColumn(name = "bookingId")
    @NotBlank
    @NotNull
    private Booking booking;

    @NotBlank
    @NotNull
    private String name;

    @NotBlank
    @NotNull
    private String email;

    @NotBlank
    @NotNull
    private String phoneNo;

    @NotBlank
    @NotNull
    private String address;

    public Guest(Long guestId, Booking booking, String name, String email, String phoneNo, String address) {
        this.guestId = guestId;
        this.booking = booking;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public Guest() {
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest)) return false;
        Guest guest = (Guest) o;
        return guestId.equals(guest.guestId) && booking.equals(guest.booking) && name.equals(guest.name) && email.equals(guest.email) && phoneNo.equals(guest.phoneNo) && address.equals(guest.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guestId, booking, name, email, phoneNo, address);
    }
}
