package com.demo.hotelBooking.mapping;

import com.demo.hotelBooking.dto.HotelDTO;
import com.demo.hotelBooking.model.Hotel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface HotelMapper {
    HotelDTO toDto(Hotel hotel);

    Hotel toEntity(HotelDTO hotelDTO);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDtoHotel(HotelDTO hotelDTO, @MappingTarget Hotel hotel);
}
