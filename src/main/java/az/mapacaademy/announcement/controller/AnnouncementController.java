package az.mapacaademy.announcement.controller;


import az.mapacaademy.announcement.dto.CreateAnnouncementRequest;
import az.mapacaademy.announcement.dto.AnnouncementResponse;
import az.mapacaademy.announcement.dto.UpdateAnnouncementRequest;
import az.mapacaademy.announcement.entity.Announcement;
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
     public void createAnnouncement(@RequestBody CreateAnnouncementRequest request){
        announcementService.createAnnouncement(request);
     }


     @PutMapping("/{announcementId}")
    public void updateAnnouncement(@PathVariable("announcementId") Long announcementId,
                                   @RequestBody UpdateAnnouncementRequest request){
        announcementService.updateAnnouncement(announcementId,request);
     }

     @DeleteMapping("/{announcementId}")
    public void delete(@PathVariable ("announcementId") Long announcementId){
        announcementService.deleteAnnouncement(announcementId);
     }
     @GetMapping("/{announcementId}")
    public AnnouncementResponse getById(@PathVariable("announcementId") Long announcementId){
         return announcementService.getById(announcementId);

     }


}
