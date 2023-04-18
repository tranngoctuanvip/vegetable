package com.thuanthanh.vegetables.Service;

import com.thuanthanh.vegetables.Entity.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    void delete(List<Integer> id);
    void add(Product product, Integer cid);
    Product update(Product product, Integer prid);
    List<Map<String,Object>> search(String pname);
    List<Map<String,Object>> productsell();
    List<Object[]> searchbyprice(Integer start , Integer end);
}
