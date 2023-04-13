package com.thuanthanh.vegetables.Service;

import com.thuanthanh.vegetables.Entity.Order;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface OrderService {
    Order add(Order order,Integer urid,Integer cartid);
    List<Map<String,Object>> getAll(Integer id);
    void update(Order order,Integer id) throws ParseException;
    void delete(Integer id);
}
