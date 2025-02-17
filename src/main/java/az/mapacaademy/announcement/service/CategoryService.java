package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.CategoryDao;
import az.mapacaademy.announcement.dto.CategoryDto;
import az.mapacaademy.announcement.entity.Category;
import az.mapacaademy.announcement.mapper.CategoryMapper;

import java.util.List;

public class CategoryService {
    private final CategoryDao categoryDao = new CategoryDao();
    private final CategoryMapper categoryMapper = new CategoryMapper();
     public List<CategoryDto> getAllCategories(){
         List<Category> categories = categoryDao.findAll();
          return categoryMapper.toDtoList(categories);

        }

}
