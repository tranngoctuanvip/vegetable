package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.Category;
import com.thuanthanh.vegetables.Repository.CategoryRepository;
import com.thuanthanh.vegetables.Service.CategoryService;
import org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        try {
            Category ca = new Category();
            ca.setName(category.getName());
            if(category.getName().isEmpty() || category.getName() == null){
                throw new MessageDescriptorFormatException("Name can't null");
            }
            ca.setStatus(1);
            ca.setDeleted(0);
            ca.setCreateTime(new Date());
            return categoryRepository.save(ca);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Category update(Category category,Integer id) {
        try {
            Category categories =  categoryRepository.findById(id).get();
            categories.setName(category.getName());
            if(category.getName().isEmpty() || category.getName() == null){
                throw new MessageDescriptorFormatException("Name can't null");
            }
            categories.setUpdateTime(new Date());
            return categoryRepository.save(categories);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(List<Integer> id) {
        try{
            categoryRepository.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Category> search(String name) {
        try{
          List<Category> categories = categoryRepository.search(name);
          return categories;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
