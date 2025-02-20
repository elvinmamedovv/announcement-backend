package az.mapacaademy.announcement.controller;


import az.mapacaademy.announcement.dao.CityDao;
import az.mapacaademy.announcement.dto.CityDto;
import az.mapacaademy.announcement.entity.City;
import az.mapacaademy.announcement.mapper.CityMapper;
import az.mapacaademy.announcement.service.CityService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("api/v1/cities")
@RestController
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping
    public List<CityDto> getCities() {

        return cityService.getAll();


    }
}
