package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.Cart;
import com.thuanthanh.vegetables.Repository.CartRepository;
import com.thuanthanh.vegetables.Repository.ProductReporitory;
import com.thuanthanh.vegetables.Repository.UserRepository;
import com.thuanthanh.vegetables.Service.CartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CartService")
public class CartServiceImpl implements CartService {
    public static final Logger logger = LoggerFactory.getLogger(CartServiceImpl.class);
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ProductReporitory productReporitory;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Cart add(Cart cart,Integer prid,Integer urid) {
        try{
            Cart c = new Cart();
            c.setQuality(cart.getQuality()+1);
            c.setStatus(1);
            c.setDeleted(0);
            c.setSum(c.getQuality() * productReporitory.findById(prid).get().getPrice());
            c.setProduct(productReporitory.findById(prid).get());
            c.setUser(userRepository.findById(urid).get());
            return cartRepository.save(c);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
    @Override
    public void delete(List<Integer> id) {
        try{
            cartRepository.delete(id);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public Cart total(Integer urid) {
        try{
            return cartRepository.sumtotal(urid);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Cart> getAll(Integer urid) {
        try {
            List<Cart> carts = cartRepository.getall(urid);
            return carts;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
