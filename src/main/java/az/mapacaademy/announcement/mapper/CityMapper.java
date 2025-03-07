package az.mapacaademy.announcement.mapper;


import az.mapacaademy.announcement.dto.CityDto;
import az.mapacaademy.announcement.entity.City;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {

    List<CityDto> toDtoList(List<City> cities);
    CityDto toDto(City city);


    }

