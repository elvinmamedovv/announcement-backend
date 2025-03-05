package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.CategoryDao;
import az.mapacaademy.announcement.dto.CategoryDto;
import az.mapacaademy.announcement.entity.Category;
import az.mapacaademy.announcement.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryDao categoryDao;
    private final CategoryMapper categoryMapper;
     public List<CategoryDto> getAllCategories(){
         log.info("Getting all categories");
         List<Category> categories = categoryDao.findAll();
         log.info("Categories got: {}",categories);
          return categoryMapper.toDtoList(categories);

        }

}
