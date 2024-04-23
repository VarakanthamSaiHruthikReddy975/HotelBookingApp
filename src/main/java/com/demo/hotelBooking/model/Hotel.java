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






}
