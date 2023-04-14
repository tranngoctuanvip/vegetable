package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.DetailProduct;
import com.thuanthanh.vegetables.Repository.DetailProductRepository;
import com.thuanthanh.vegetables.Repository.ProductReporitory;
import com.thuanthanh.vegetables.Service.DetailProductService;
import org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("DetailProduct")
public class DetailProductServiceImpl implements DetailProductService {
    @Autowired
    private DetailProductRepository detailProductRepository;
    @Autowired
    private ProductReporitory productReporitory;

    @Override
    public void add(DetailProduct detailProduct,Integer prid) {
        try {
            DetailProduct detail = new DetailProduct();
            detail.setDetail(detailProduct.getDetail());
            if(detailProduct.getDetail().isEmpty() || detailProduct.getDetail() == null){
                throw new RuntimeException("Detail can't null!");
            }
            detail.setStatus(1);
            detail.setDeleted(0);
            detail.setCreateTime(new Date());
            detail.setProduct(productReporitory.findById(prid).get());
            detailProductRepository.save(detail);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public DetailProduct update(DetailProduct detailProduct, Integer id) {
        try{
            DetailProduct detail = detailProductRepository.findById(id).get();
            if(detail == null){
                throw new MessageDescriptorFormatException("can't found id");
            }
            else {
                detail.setDetail(detailProduct.getDetail());
                if(detailProduct.getDetail().isEmpty() || detail.getDetail() == null){
                    throw new RuntimeException("detail can't null");
                }
                detail.setStatus(1);
                detail.setDeleted(0);
                detail.setUpdateTime(new Date());
                detail.setProduct(productReporitory.findById(id).get());
                return detailProductRepository.save(detail);
            }
        } catch (MessageDescriptorFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(List<Integer> id) {
        try{
            productReporitory.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<DetailProduct> getall() {
        return detailProductRepository.getall();
    }
}
