package com.demo.hotelBooking.mapping;

import com.demo.hotelBooking.dto.BookingDTO;
import com.demo.hotelBooking.model.Booking;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BookingMapper {
    BookingDTO toDTO(Booking booking);
    Booking toEntity(BookingDTO bookingDTO);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDTOBooking(BookingDTO bookingDTO, @MappingTarget Booking booking);
}
