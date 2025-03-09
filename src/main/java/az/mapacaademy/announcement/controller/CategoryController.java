package az.mapacaademy.announcement.controller;


import az.mapacaademy.announcement.dto.BaseResponse;
import az.mapacaademy.announcement.dto.CategoryDto;
import az.mapacaademy.announcement.service.CategoryService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public BaseResponse<List<CategoryDto>> getAllCategories(){
        log.info("Get all categories");
        List<CategoryDto> categoryDtos = categoryService.getAllCategories();
        BaseResponse<List<CategoryDto>> baseResponse = new BaseResponse<>();
        baseResponse.setData(categoryDtos);

        return baseResponse;
    }


}
