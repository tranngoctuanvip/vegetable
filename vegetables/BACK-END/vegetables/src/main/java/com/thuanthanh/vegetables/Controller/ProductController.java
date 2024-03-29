package com.thuanthanh.vegetables.Controller;

import com.thuanthanh.vegetables.Entity.Product;
import com.thuanthanh.vegetables.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("add")
    public ResponseEntity<?> save(@RequestBody Product product, @Param("cid") Integer cid){
        try{
            productService.add(product, cid);
            return ResponseEntity.ok("Add product success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody Product product, @Param("prid") Integer prid){
        try {
            productService.update(product,prid);
            return ResponseEntity.ok("Update product success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("delete")
    public ResponseEntity<?> delete(@RequestParam List<Integer> id){
        try{
            productService.delete(id);
            return ResponseEntity.ok("Delete product success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("search")
    public ResponseEntity<?> search(String pname){
        try {
            return new ResponseEntity<>(productService.search(pname),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("productsell")
    public ResponseEntity<?> productsell(){
        try {
            return new ResponseEntity<>(productService.productsell(),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("searchbyprice")
    public ResponseEntity<?> searchbyprice(@RequestParam Integer start, @RequestParam Integer end){
        try{
            return new ResponseEntity<>(productService.searchbyprice(start,end),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
