package az.mapacaademy.announcement.repository;

import az.mapacaademy.announcement.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
