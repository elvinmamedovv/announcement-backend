package az.mapacaademy.announcement.dao.jpaimpl;

import az.mapacaademy.announcement.dao.AnnouncementDao;
import az.mapacaademy.announcement.entity.Announcement;
import az.mapacaademy.announcement.repository.AnnouncementRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository("announcementDaoJpaImpl")
@RequiredArgsConstructor
@Slf4j
public class AnnouncementDaoJpaImpl implements AnnouncementDao {
    private final AnnouncementRepository announcementRepository;
    @Override
    public List<Announcement> findAll() {
        log.info("Find all announcements method is  called from JPA implementation of AnnouncementDao");
        return announcementRepository.findAll();
    }

    @Override
    public void create(Announcement announcement) {
        log.info("Create announcement method is called from JPA implementation of AnnouncementDao");
        announcementRepository.save(announcement);

    }

    @Override
    public void update(Announcement announcement) {
        log.info("Update announcement method is called from JPA implementation of AnnouncementDao");
        announcementRepository.save(announcement);

    }

    @Override
    public void delete(Long announcementId) {
        log.info("Delete announcement method is called from JPA implementation of AnnouncementDao");
        announcementRepository.deleteById(announcementId);

    }

    @Override
    public Optional<Announcement> findById(Long announcementId) {
        log.info("Find announcement method is called from JPA implementation of AnnouncementDao");
        return announcementRepository.findById(announcementId) ;
    }
}
