package com.thuanthanh.vegetables.Service;

import com.thuanthanh.vegetables.Entity.DetailProduct;
import org.springframework.data.domain.Page;

import java.util.List;

public interface DetailProductService {
    void add(DetailProduct detailProduct,Integer prid);
    DetailProduct update(DetailProduct detailProduct, Integer id);
    void delete(List<Integer> id);
    List<DetailProduct> getall();
    Page<DetailProduct> search(String start, String end,int size,int limit);
}
