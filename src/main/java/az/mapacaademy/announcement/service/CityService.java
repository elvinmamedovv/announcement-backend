package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.CityDao;
import az.mapacaademy.announcement.dto.CityDto;
import az.mapacaademy.announcement.entity.City;
import az.mapacaademy.announcement.mapper.CityMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CityService {

    private final CityDao cityDao;
    private final CityMapper cityMapper;


    public List<CityDto> getAll() {

        List<City> cities = cityDao.findAll();

        return cityMapper.toDtoList(cities);


    }
}
