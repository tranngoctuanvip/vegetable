package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.DetailProduct;
import com.thuanthanh.vegetables.Repository.DetailProductRepository;
import com.thuanthanh.vegetables.Repository.ProductReporitory;
import com.thuanthanh.vegetables.Service.DetailProductService;
import com.thuanthanh.vegetables.StringUtil.Utils;
import org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("DetailProduct")
public class DetailProductServiceImpl implements DetailProductService {
    public static final Logger logger = LoggerFactory.getLogger(DetailProductServiceImpl.class);
    @Autowired
    private DetailProductRepository detailProductRepository;
    @Autowired
    private ProductReporitory productReporitory;

    private Utils utils = new Utils();
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
            logger.error(e.getMessage());
        }
    }

    @Override
    public DetailProduct update(DetailProduct detailProduct, Integer id) {
        try{
            DetailProduct detail = detailProductRepository.findById(id).get();
            if(detail == null){
                throw new MessageDescriptorFormatException("Can't found id");
            }
            else {
                detail.setDetail(detailProduct.getDetail());
                if(detailProduct.getDetail().isEmpty() || detail.getDetail() == null){
                    throw new MessageDescriptorFormatException("detail can't null");
                }
                detail.setStatus(1);
                detail.setDeleted(0);
                detail.setUpdateTime(new Date());
                detail.setProduct(productReporitory.findById(id).get());
                return detailProductRepository.save(detail);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(List<Integer> id) {
        try{
            productReporitory.delete(id);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public List<DetailProduct> getall() {
        try {
            return detailProductRepository.getall();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Page<DetailProduct> search(String start, String end, int size, int limit) {
        try{
            PageRequest pageRequest = PageRequest.of(size,limit);
            Page<DetailProduct> pages = detailProductRepository.search(start,end,pageRequest);
            return pages;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
