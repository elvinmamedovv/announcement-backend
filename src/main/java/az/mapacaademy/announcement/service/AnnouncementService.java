package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.AnnouncementDao;
import az.mapacaademy.announcement.dto.AnnouncementDto;
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



    public List<AnnouncementDto> getAllAnnouncements(){
        List<Announcement> announcements = announcementDao.findAll();
        return announcementMapper.toDtoList(announcements);

    }
}
