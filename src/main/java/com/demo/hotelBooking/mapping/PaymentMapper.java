package com.demo.hotelBooking.mapping;

import com.demo.hotelBooking.dto.PaymentDTO;
import com.demo.hotelBooking.model.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    PaymentDTO toDto(Payment payment);

    Payment toEntity(PaymentDTO paymentDTO);

    @Mapping(target="id", ignore = true)
    void updateEntityFromDtoPayment(PaymentDTO paymentDTO, @MappingTarget Payment payment);
}
