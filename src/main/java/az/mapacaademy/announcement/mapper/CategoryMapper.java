package az.mapacaademy.announcement.mapper;

import az.mapacaademy.announcement.dto.CategoryDto;
import az.mapacaademy.announcement.entity.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CategoryMapper {
    public CategoryDto toDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName(category.getName());
        categoryDto.setCategoryId(category.getCategoryId());
        return categoryDto;
    }

        public List<CategoryDto> toDtoList(List<Category> categoryList ){
            List<CategoryDto> categoryDtoList = new ArrayList<>();
             return categoryList.stream()
                     .map(this::toDto)
                     .toList();
        }
    }

