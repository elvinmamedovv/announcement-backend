package az.mapacaademy.announcement.dao;

import az.mapacaademy.announcement.entity.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> findAll();
}
