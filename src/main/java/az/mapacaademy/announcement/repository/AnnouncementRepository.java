package az.mapacaademy.announcement.repository;

import az.mapacaademy.announcement.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository<Announcement,Long> {
}
