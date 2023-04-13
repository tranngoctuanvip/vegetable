package com.thuanthanh.vegetables.Controller;

import com.thuanthanh.vegetables.Entity.Cart;
import com.thuanthanh.vegetables.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("cart")
public class CartController {
    @Autowired
    private CartService cartService;
    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody Cart cart, @Param("prid") Integer prid, @Param("urid") Integer urid){
        try{
            cartService.add(cart, prid,urid);
            return ResponseEntity.ok("Added to cart");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("delete")
    public ResponseEntity<?> delete(@RequestParam List<Integer> id){
        try{
            cartService.delete(id);
            return ResponseEntity.ok("Delete cart success!");
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll(@RequestParam Integer urid){
        try{
            return new ResponseEntity<>(cartService.getAll(urid),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
