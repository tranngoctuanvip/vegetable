package com.thuanthanh.vegetables.Service;

import com.thuanthanh.vegetables.Entity.Order;

import java.util.List;
import java.util.Map;

public interface OrderService {
    Order add(Order order,Integer urid,Integer cartid);
    List<Map<String,Object>> getAll(Integer id);
    void update(Order order,Integer id);
    void delete(Integer id);
    void update_status(List<Integer> id);

}
