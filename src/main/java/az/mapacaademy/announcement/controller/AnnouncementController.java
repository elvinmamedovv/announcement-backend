package az.mapacaademy.announcement.controller;


import az.mapacaademy.announcement.dto.BaseResponse;
import az.mapacaademy.announcement.dto.CreateAnnouncementRequest;
import az.mapacaademy.announcement.dto.AnnouncementResponse;
import az.mapacaademy.announcement.dto.UpdateAnnouncementRequest;
import az.mapacaademy.announcement.entity.Announcement;
import az.mapacaademy.announcement.service.AnnouncementService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RequestMapping("api/v1/announcements")
@RestController
@RequiredArgsConstructor
public class AnnouncementController {

    private final AnnouncementService announcementService;

    @GetMapping
     public BaseResponse<List<AnnouncementResponse>>getAllAnnouncements(){
        log.info("Get announcements API is called");
        List<AnnouncementResponse> responses = announcementService.getAllAnnouncements();
        BaseResponse<List<AnnouncementResponse>> baseResponse = new BaseResponse<>();
        baseResponse.setData(responses);
        return baseResponse;

     }


     @PostMapping
     public void createAnnouncement(@RequestBody @Valid CreateAnnouncementRequest request){
        log.info("Create announcement API is called, request: {}",request);
        announcementService.createAnnouncement(request);
     }


     @PutMapping("/{announcementId}")
    public void updateAnnouncement(@PathVariable("announcementId") Long announcementId,
                                   @RequestBody @Valid UpdateAnnouncementRequest request){
        log.info("Update announcement API is called, announcementId: {}, request: {}", announcementId,request);
        announcementService.updateAnnouncement(announcementId,request);
     }

     @DeleteMapping("/{announcementId}")
    public void delete(@PathVariable ("announcementId") Long announcementId){
        log.info("Delete announcement API is called, announcementId: {}", announcementId);
        announcementService.deleteAnnouncement(announcementId);
     }
     @GetMapping("/{announcementId}")
    public BaseResponse<AnnouncementResponse> getById(@PathVariable("announcementId") Long announcementId){
        log.info("Get announcement by id API is called, announcementId: {}", announcementId);
         AnnouncementResponse response = announcementService.getById(announcementId);
         BaseResponse<AnnouncementResponse> baseResponse = new BaseResponse<>();
         baseResponse.setData(response);
         return baseResponse;

     }


}
