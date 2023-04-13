package com.thuanthanh.vegetables.Service;

import com.thuanthanh.vegetables.Entity.Order;

import java.util.List;

public interface OrderService {
    Order add(Order order,Integer urid,Integer cartid);
    Order getAll(Integer id);
    void update(Order order,Integer id);

    void delete(List<Integer> id);
}
