package az.mapacaademy.announcement.dao;

import az.mapacaademy.announcement.entity.Announcement;

import java.util.List;
import java.util.Optional;

public interface AnnouncementDao {
    List<Announcement> findAll();

    void create(Announcement announcement);

    void update(Announcement announcement);

    void delete(Long announcementId);

    Optional<Announcement> findById(Long announcementId);
}
