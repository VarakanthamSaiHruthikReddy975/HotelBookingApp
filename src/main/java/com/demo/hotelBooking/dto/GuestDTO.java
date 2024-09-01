package com.demo.hotelBooking.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
public class GuestDTO {
    private String name;
    private String email;
    private String phoneNo;
    private String address;

    public GuestDTO(String name, String email, String phoneNo, String address) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public GuestDTO() {
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
        if (!(o instanceof GuestDTO)) return false;
        GuestDTO guestDTO = (GuestDTO) o;
        return name.equals(guestDTO.name) && email.equals(guestDTO.email) && phoneNo.equals(guestDTO.phoneNo) && address.equals(guestDTO.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phoneNo, address);
    }
}
