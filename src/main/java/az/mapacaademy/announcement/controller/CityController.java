package az.mapacaademy.announcement.controller;


import az.mapacaademy.announcement.dto.CityDto;
import az.mapacaademy.announcement.service.CityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RequestMapping("api/v1/cities")
@RestController
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping
    public List<CityDto> getCities() {
        log.info("Get cities API is called");

        return cityService.getAll();


    }
}
