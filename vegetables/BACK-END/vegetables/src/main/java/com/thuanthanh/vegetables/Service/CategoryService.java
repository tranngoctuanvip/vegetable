package com.thuanthanh.vegetables.Service;

import com.thuanthanh.vegetables.Entity.Category;

import java.util.List;

public interface CategoryService {
    Category save(Category category);
    Category update(Category category, Integer id);
    void delete(List<Integer> id);
    List<Category> search(String name);
}
