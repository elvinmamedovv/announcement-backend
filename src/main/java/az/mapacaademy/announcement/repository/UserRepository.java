package az.mapacaademy.announcement.repository;

import az.mapacaademy.announcement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
