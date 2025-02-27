package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.AnnouncementDao;
import az.mapacaademy.announcement.dto.AnnouncementRequest;
import az.mapacaademy.announcement.dto.AnnouncementResponse;
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
    public void createAnnouncement(AnnouncementRequest request){
        Announcement announcement = announcementMapper.toEntity(request);
        announcementDao.create(announcement);
    }
}
