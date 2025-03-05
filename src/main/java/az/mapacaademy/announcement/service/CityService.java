package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.CityDao;
import az.mapacaademy.announcement.dto.CityDto;
import az.mapacaademy.announcement.entity.City;
import az.mapacaademy.announcement.mapper.CityMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class CityService {

    private final CityDao cityDao;
    private final CityMapper cityMapper;


    public List<CityDto> getAll() {
        log.info("Getting all cities");

        List<City> cities = cityDao.findAll();
        log.info("Cities got: {}", cities);

        return cityMapper.toDtoList(cities);


    }
}
