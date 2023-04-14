package com.thuanthanh.vegetables.Service;

import com.thuanthanh.vegetables.Entity.DetailProduct;

import java.util.List;

public interface DetailProductService {
    void add(DetailProduct detailProduct,Integer prid);
    DetailProduct update(DetailProduct detailProduct, Integer id);
    void delete(List<Integer> id);

    List<DetailProduct> getall();
}
