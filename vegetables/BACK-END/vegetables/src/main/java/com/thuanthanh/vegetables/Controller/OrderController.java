package com.thuanthanh.vegetables.Controller;

import com.thuanthanh.vegetables.Entity.Order;
import com.thuanthanh.vegetables.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public ResponseEntity<?> update(@RequestBody Order order,Integer urid){
        try {
            orderService.update(order,urid);
            return ResponseEntity.ok("update Order success");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("delete")
    public ResponseEntity<?> cancel(@Param("urid") List<Integer> urid){
        try{
            orderService.delete(urid);
            return ResponseEntity.ok("cancel order success!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
