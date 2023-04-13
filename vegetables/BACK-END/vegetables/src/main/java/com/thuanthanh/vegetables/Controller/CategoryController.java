package com.thuanthanh.vegetables.Controller;

import com.thuanthanh.vegetables.Entity.Category;
import com.thuanthanh.vegetables.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("save")
    public ResponseEntity<?> add(@RequestBody Category category){
        try{
            categoryService.save(category);
            return ResponseEntity.ok("Add Category success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody Category category,@Param("id") Integer id){
        try{
            categoryService.update(category,id);
            return ResponseEntity.ok("Update category success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("delete")
    public ResponseEntity<?> delete(@RequestParam List<Integer> id){
        try{
            categoryService.delete(id);
            return ResponseEntity.ok("Delete category success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("search")
    public ResponseEntity<List<Category>> search(@Param("name") String name){
        try{
           return new ResponseEntity<>(categoryService.search(name),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
