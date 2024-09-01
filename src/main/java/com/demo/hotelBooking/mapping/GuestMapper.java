package com.demo.hotelBooking.mapping;

import com.demo.hotelBooking.dto.GuestDTO;
import com.demo.hotelBooking.model.Guest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface GuestMapper {
    GuestDTO toDTO(Guest guest);
    Guest toEntity(GuestDTO guestDTO);

    @Mapping(target="id",ignore = true)
    void updateEntityFromDtoGuest(GuestDTO guestDTO, @MappingTarget Guest guest);

}
