package az.mapacaademy.announcement.controller;


import az.mapacaademy.announcement.dto.AnnouncementRequest;
import az.mapacaademy.announcement.dto.AnnouncementResponse;
import az.mapacaademy.announcement.service.AnnouncementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/announcements")
@RestController
@RequiredArgsConstructor
public class AnnouncementController {

    private final AnnouncementService announcementService;

    @GetMapping
     public List<AnnouncementResponse> getAllAnnouncements(){

        return announcementService.getAllAnnouncements();
     }


     @PostMapping
     public void createAnnouncement(@RequestBody AnnouncementRequest request){
        announcementService.createAnnouncement(request);
     }



}
