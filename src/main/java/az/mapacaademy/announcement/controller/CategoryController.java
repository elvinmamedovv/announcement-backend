package az.mapacaademy.announcement.controller;


import az.mapacaademy.announcement.dto.CategoryDto;
import az.mapacaademy.announcement.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    private CategoryService categoryService = new CategoryService();

    @GetMapping
    public List<CategoryDto> getAllCategories(){
        return  categoryService.getAllCategories();
    }


}
