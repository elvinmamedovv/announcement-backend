package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.AnnouncementDao;
import az.mapacaademy.announcement.dto.CreateAnnouncementRequest;
import az.mapacaademy.announcement.dto.AnnouncementResponse;
import az.mapacaademy.announcement.dto.UpdateAnnouncementRequest;
import az.mapacaademy.announcement.entity.Announcement;
import az.mapacaademy.announcement.mapper.AnnouncementMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AnnouncementService {


    private final AnnouncementDao announcementDao;
    private final AnnouncementMapper announcementMapper;



    public List<AnnouncementResponse> getAllAnnouncements(){
        List<Announcement> announcements = announcementDao.findAll();
        return announcementMapper.toResponseList(announcements);

    }
    public void createAnnouncement(CreateAnnouncementRequest request){
        Announcement announcement = announcementMapper.toEntity(request);
        announcementDao.create(announcement);
    }

    public void updateAnnouncement(Long announcementId, UpdateAnnouncementRequest request){
        Announcement announcement = announcementMapper.toEntity(announcementId,request);
        announcementDao.update(announcement);
    }
    public  void deleteAnnouncement(Long announcementId){
        announcementDao.delete(announcementId);
    }

    public AnnouncementResponse getById(Long announcementId){
        Announcement announcement = announcementDao.getById(announcementId);
        return announcementMapper.toResponse(announcement);

    }
}
