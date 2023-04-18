package com.thuanthanh.vegetables.Controller;

import com.thuanthanh.vegetables.Entity.DetailProduct;
import com.thuanthanh.vegetables.Service.DetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("DetailProduct")
public class DetailProductController {
    @Autowired
    private DetailProductService detailProductService;

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody DetailProduct detailProduct, @Param("prid") Integer prid){
        try{
            detailProductService.add(detailProduct,prid);
            return ResponseEntity.ok("Add DetailProduct success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody DetailProduct detailProduct,@Param("id") Integer id){
        try {
            detailProductService.update(detailProduct,id);
            return ResponseEntity.ok("update DetailProduct success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("delete")
    public ResponseEntity<?> delete(@Param("id") List<Integer> id){
        try{
            detailProductService.delete(id);
            return ResponseEntity.ok("Delete DetailProduct success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("getall")
    public ResponseEntity<?> getall(){
        try{
            return new ResponseEntity<>(detailProductService.getall(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("search")
    public ResponseEntity<?> searchByDate(@Param("start") String start, @Param("end") String end,@RequestParam("size") Integer size,@RequestParam("limit") Integer limit){
        try {
            return new ResponseEntity<>(detailProductService.search(start,end,size,limit),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
