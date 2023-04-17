package com.thuanthanh.vegetables.Controller;

import com.thuanthanh.vegetables.Service.StatisticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("statistical")
public class StatisticalController {
    @Autowired
    private StatisticalService statisticalService;

    @GetMapping("month")
    public ResponseEntity<?> getall(@Param("month") String month){
        try{
            return new ResponseEntity<>(statisticalService.getall(month), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("all")
    public ResponseEntity<?> get(@Param("month") String month, @Param("quarter") String quarter, @Param("year") String year){
        try {
            return new ResponseEntity<>(statisticalService.get(month,quarter,year),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
