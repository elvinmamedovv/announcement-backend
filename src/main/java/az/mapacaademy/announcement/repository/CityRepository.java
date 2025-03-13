package az.mapacaademy.announcement.repository;

import az.mapacaademy.announcement.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
