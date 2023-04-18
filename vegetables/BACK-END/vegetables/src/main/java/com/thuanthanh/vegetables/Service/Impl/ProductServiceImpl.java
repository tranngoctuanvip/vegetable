package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.Product;
import com.thuanthanh.vegetables.Repository.CategoryRepository;
import com.thuanthanh.vegetables.Repository.ProductReporitory;
import com.thuanthanh.vegetables.Service.ProductService;
import org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {
    public static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    private ProductReporitory productReporitory;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void delete(List<Integer> id) {
        try {
            productReporitory.delete(id);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void add(Product product,Integer cid) {
        try {
            Product pr = new Product();
            pr.setName(product.getName());
            if(product.getName().isEmpty() || product.getName() == null){
                throw new MessageDescriptorFormatException("Name can't null");
            }
            pr.setImage(product.getImage());
            pr.setPrice(product.getPrice());
            pr.setQuality(product.getQuality());
            pr.setCreateTime(new Date());
            pr.setStatus(1);
            pr.setDeleted(0);
            pr.setCategoryId(categoryRepository.findById(cid).get());
            productReporitory.save(pr);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public Product update(Product product, Integer prid) {
        try{
            Product pr = productReporitory.findById(prid).get();
            if(pr != null){
                pr.setName(product.getName());
                if(product.getName().isEmpty() || product.getName() == null){
                    throw new MessageDescriptorFormatException("Name can not null");
                }
                pr.setImage(product.getImage());
                pr.setPrice(product.getPrice());
                pr.setQuality(product.getQuality());
                pr.setUpdateTime(new Date());
                pr.setStatus(1);
                pr.setDeleted(0);
                pr.setCategoryId(categoryRepository.findById(prid).get());
            }
            return productReporitory.save(pr);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Map<String, Object>> search(String pname) {
        try{
          return productReporitory.search(pname);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Map<String, Object>> productsell() {
        try {
            return productReporitory.productsell();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Object[]> searchbyprice(Integer start, Integer end) {
        try {
            List<Product> result = new ArrayList<>();
            List<Object[]> rows = productReporitory.searchbyprice(start,end);
            if(!rows.isEmpty() && rows != null){
                for(Object[] row : rows){
                    Product product = new Product();
                    if(row[0] != null){
                        product.setName(product.getName());
                    }
                    if(row[1] != null){
                        product.setPrice(product.getPrice());
                    }
                    if(row[2] != null){
                        product.setQuality(product.getQuality());
                    }
                    if(row[3] != null){
                        product.setImage(product.getImage());
                    }
                    result.add(product);
                }
            }
            return rows;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
