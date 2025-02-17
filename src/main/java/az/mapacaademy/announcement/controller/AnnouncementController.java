package az.mapacaademy.announcement.controller;


import az.mapacaademy.announcement.dto.AnnouncementDto;
import az.mapacaademy.announcement.service.AnnouncementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/announcements")
@RestController
public class AnnouncementController {

    AnnouncementService announcementService = new AnnouncementService();

    @GetMapping
     public List<AnnouncementDto> getAllAnnouncements(){
         return announcementService.getAllAnnouncements();
     }



}
