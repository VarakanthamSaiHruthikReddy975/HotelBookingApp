package com.demo.hotelBooking.mapping;

import com.demo.hotelBooking.dto.RoomDTO;
import com.demo.hotelBooking.model.Room;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface RoomMapper {
    RoomDTO toDto(Room room);
    Room toEntity(RoomDTO roomDTO);

    @Mapping(target="id", ignore = true)
    void updateEntityFromDtoRoom(RoomDTO roomDTO, @MappingTarget Room room);
}
