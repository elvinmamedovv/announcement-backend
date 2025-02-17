package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.AnnouncementDao;
import az.mapacaademy.announcement.dto.AnnouncementDto;
import az.mapacaademy.announcement.dto.CategoryDto;
import az.mapacaademy.announcement.entity.Announcement;
import az.mapacaademy.announcement.mapper.AnnouncementMapper;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementService {


    private final AnnouncementDao announcementDao = new AnnouncementDao();
    private final AnnouncementMapper announcementMapper = new AnnouncementMapper();



    public List<AnnouncementDto> getAllAnnouncements(){
        List<Announcement> announcements = announcementDao.findAll();
        return announcementMapper.toDtoList(announcements);

    }
}
