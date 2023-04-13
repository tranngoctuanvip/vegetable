package com.thuanthanh.vegetables.Service;

import com.thuanthanh.vegetables.Entity.Cart;

import java.util.List;

public interface CartService {
    Cart add(Cart cart,Integer prid, Integer urid);
    void delete(List<Integer> id);
    Cart total(Integer urid);
    List<Cart> getAll(Integer urid);
}
