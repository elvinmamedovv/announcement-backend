package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.AnnouncementDao;
import az.mapacaademy.announcement.dto.CreateAnnouncementRequest;
import az.mapacaademy.announcement.dto.AnnouncementResponse;
import az.mapacaademy.announcement.dto.UpdateAnnouncementRequest;
import az.mapacaademy.announcement.entity.Announcement;
import az.mapacaademy.announcement.mapper.AnnouncementMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class AnnouncementService {


    private final AnnouncementDao announcementDao;
    private final AnnouncementMapper announcementMapper;



    public List<AnnouncementResponse> getAllAnnouncements(){
        List<Announcement> announcements = announcementDao.findAll();
        log.info("Announcement found: {}", announcements);

        return announcementMapper.toResponseList(announcements);

    }
    public void createAnnouncement(CreateAnnouncementRequest request){
        Announcement announcement = announcementMapper.toEntity(request);
        log.info("Announcement create entity: {}", announcement);
        announcementDao.create(announcement);
    }

    public void updateAnnouncement(Long announcementId, UpdateAnnouncementRequest request){
        Announcement announcement = announcementMapper.toEntity(announcementId,request);
        log.info("Announcement update entity: {}", announcement);
        announcementDao.update(announcement);
    }
    public  void deleteAnnouncement(Long announcementId){
        announcementDao.delete(announcementId);
    }

    public AnnouncementResponse getById(Long announcementId){
        log.info("Found announcement by id: {}", announcementId);
        Announcement announcement = announcementDao.getById(announcementId);
        return announcementMapper.toResponse(announcement);

    }
}
