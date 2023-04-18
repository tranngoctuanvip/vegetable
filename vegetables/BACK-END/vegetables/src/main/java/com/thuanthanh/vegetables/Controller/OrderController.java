package com.thuanthanh.vegetables.Controller;

import com.thuanthanh.vegetables.Entity.Order;
import com.thuanthanh.vegetables.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("Order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody Order order, @Param("urid") Integer urid, @Param("cartid") Integer cartid){
        try{
            orderService.add(order,urid,cartid);
            return ResponseEntity.ok("Order Success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody Order order,Integer id){
        try {
            orderService.update(order,id);
            return ResponseEntity.ok("update Order success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("delete")
    public ResponseEntity<?> cancel(@Param("urid") Integer urid){
        try{
            orderService.delete(urid);
            return ResponseEntity.ok("Cancel order success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("getall")
    public ResponseEntity<?> getall(@RequestParam Integer urid){
        try{
            return new ResponseEntity<>(orderService.getAll(urid),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("updatestatus")
    public ResponseEntity<?> updatestatus(@RequestParam List<Integer> id){
        try {
            orderService.update_status(id);
            return ResponseEntity.ok("Update order status success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
