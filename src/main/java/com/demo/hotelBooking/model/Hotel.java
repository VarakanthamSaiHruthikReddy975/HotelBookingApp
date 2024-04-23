package com.demo.hotelBooking.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "hotels")
@Data
@Builder
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long hotelId;

    @Column(nullable = false)
    @NotNull
    @NotBlank
    private String name;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private String address;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private String city;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private String state;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private String zipCode;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private String phoneNo;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private String country;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private String description;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private Integer starRating;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private String urlLink;

    public Hotel(Long hotelId, String name, String address, String city, String state, String zipCode, String phoneNo, String country, String description, Integer starRating, String urlLink) {
        this.hotelId = hotelId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNo = phoneNo;
        this.country = country;
        this.description = description;
        this.starRating = starRating;
        this.urlLink = urlLink;
    }

    public Hotel() {
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStarRating() {
        return starRating;
    }

    public void setStarRating(Integer starRating) {
        this.starRating = starRating;
    }

    public String getUrlLink() {
        return urlLink;
    }

    public void setUrlLink(String urlLink) {
        this.urlLink = urlLink;
    }
}
