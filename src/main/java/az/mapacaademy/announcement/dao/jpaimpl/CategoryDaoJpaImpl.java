package az.mapacaademy.announcement.dao.jpaimpl;

import az.mapacaademy.announcement.dao.CategoryDao;
import az.mapacaademy.announcement.entity.Category;
import az.mapacaademy.announcement.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("categoryDaoJpaImpl")
@RequiredArgsConstructor
@Slf4j
public class CategoryDaoJpaImpl implements CategoryDao {
    final CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        log.info("Find all categories method is  called from JPA implementation of CategoryDao");
        return  categoryRepository.findAll();
    }
}
