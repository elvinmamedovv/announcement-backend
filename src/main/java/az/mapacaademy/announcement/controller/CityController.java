package az.mapacaademy.announcement.controller;


import az.mapacaademy.announcement.dao.CityDao;
import az.mapacaademy.announcement.dto.CityDto;
import az.mapacaademy.announcement.entity.City;
import az.mapacaademy.announcement.mapper.CityMapper;
import az.mapacaademy.announcement.service.CityService;
import org.apache.catalina.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("api/v1/cities")
@RestController
public class CityController {
    private final CityService cityService = new CityService();

    @GetMapping
    public List<CityDto> getCities() {


        List<CityDto> cityDtoList = cityService.getAll();

        return cityDtoList;


    }
}
