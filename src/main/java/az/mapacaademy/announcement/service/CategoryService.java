package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.CategoryDao;
import az.mapacaademy.announcement.dto.CategoryDto;
import az.mapacaademy.announcement.entity.Category;
import az.mapacaademy.announcement.mapper.CategoryMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryDao categoryDao;
    private final CategoryMapper categoryMapper;
     public List<CategoryDto> getAllCategories(){
         List<Category> categories = categoryDao.findAll();
          return categoryMapper.toDtoList(categories);

        }

}
