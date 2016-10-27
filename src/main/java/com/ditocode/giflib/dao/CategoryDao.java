package com.ditocode.giflib.dao;

import com.ditocode.giflib.model.Category;

import java.util.List;

/**
 * Created by hector on 24/10/16.
 */
public interface CategoryDao {
    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);
}
