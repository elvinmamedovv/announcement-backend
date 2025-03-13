package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.AnnouncementDao;
import az.mapacaademy.announcement.dao.jdbcimpl.AnnouncementDaoJdbcImpl;
import az.mapacaademy.announcement.dto.CreateAnnouncementRequest;
import az.mapacaademy.announcement.dto.AnnouncementResponse;
import az.mapacaademy.announcement.dto.UpdateAnnouncementRequest;
import az.mapacaademy.announcement.entity.Announcement;
import az.mapacaademy.announcement.exception.NotFoundException;
import az.mapacaademy.announcement.mapper.AnnouncementMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service

public class AnnouncementService {


    private final AnnouncementDao announcementDao;
    private final AnnouncementMapper announcementMapper;

    public AnnouncementService(@Qualifier("announcementDaoJpaImpl") AnnouncementDao announcementDao, AnnouncementMapper announcementMapper) {
        this.announcementDao = announcementDao;
        this.announcementMapper = announcementMapper;
    }


    public List<AnnouncementResponse> getAllAnnouncements() {
        List<Announcement> announcements = announcementDao.findAll();
        log.info("Announcement found: {}", announcements);

        return announcementMapper.toResponseList(announcements);

    }

    public void createAnnouncement(CreateAnnouncementRequest request) {
        Announcement announcement = announcementMapper.toEntity(request);
        log.info("Announcement create entity: {}", announcement);
        announcementDao.create(announcement);
    }

    public void updateAnnouncement(Long announcementId, UpdateAnnouncementRequest request) {
        Optional<Announcement> optAnnouncement = announcementDao.findById(announcementId);
        Announcement announcement = optAnnouncement.orElseThrow(() ->
                new NotFoundException("Announcement is not found with id : " + announcementId));
        announcementMapper.populate(request, announcement);
        log.info("Announcement update entity: {}", announcement);
        announcementDao.update(announcement);
    }

    public void deleteAnnouncement(Long announcementId) {
        announcementDao.delete(announcementId);
    }

    public AnnouncementResponse getById(Long announcementId) {
        Optional<Announcement> optAnnouncement = announcementDao.findById(announcementId);
        Announcement announcement = optAnnouncement.orElseThrow(() ->
                new NotFoundException("Announcement is not found with id : " + announcementId));

        log.info("Announcement is found by id: {}", announcement);
        return announcementMapper.toResponse(announcement);

    }
}
