package az.mapacaademy.announcement.controller;


import az.mapacaademy.announcement.dto.AnnouncementDto;
import az.mapacaademy.announcement.service.AnnouncementService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/announcements")
@RestController
@RequiredArgsConstructor
public class AnnouncementController {

    private final AnnouncementService announcementService;

    @GetMapping
     public List<AnnouncementDto> getAllAnnouncements(){

        return announcementService.getAllAnnouncements();
     }



}
