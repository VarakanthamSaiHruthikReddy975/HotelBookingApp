package com.demo.hotelBooking.model;

import com.demo.hotelBooking.enumFiles.paymentMethods;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Payment")
@Data
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "bookingId")
    private Booking booking;

    @Enumerated(EnumType.STRING)
    @NotBlank
    @NotNull
    private paymentMethods paymentMethods;

    @NotBlank
    @NotNull
    private LocalDateTime paymentDate;

    @NotBlank
    @NotNull
    @DecimalMin("0.0")
    @DecimalMax("30000.0")
    private double amount;

    public Payment(Long paymentId, Booking booking, com.demo.hotelBooking.enumFiles.paymentMethods paymentMethods, LocalDateTime paymentDate, double amount) {
        this.paymentId = paymentId;
        this.booking = booking;
        this.paymentMethods = paymentMethods;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public Payment() {
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public com.demo.hotelBooking.enumFiles.paymentMethods getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(com.demo.hotelBooking.enumFiles.paymentMethods paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
