package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.CityDao;
import az.mapacaademy.announcement.dto.CityDto;
import az.mapacaademy.announcement.entity.City;
import az.mapacaademy.announcement.mapper.CityMapper;

import java.util.List;

public class CityService {
    private final CityDao cityDao = new CityDao();
    private final CityMapper cityMapper = new CityMapper();

    public List<CityDto> getAll() {

        List<City> cities = cityDao.findAll();

        return cityMapper.toDtoList(cities);


    }
}
