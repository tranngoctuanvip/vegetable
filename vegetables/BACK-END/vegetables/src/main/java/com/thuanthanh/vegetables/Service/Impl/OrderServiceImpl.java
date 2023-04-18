package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.DetailProduct;
import com.thuanthanh.vegetables.Entity.Order;
import com.thuanthanh.vegetables.Repository.CartRepository;
import com.thuanthanh.vegetables.Repository.OrderRepository;
import com.thuanthanh.vegetables.Repository.UserRepository;
import com.thuanthanh.vegetables.Service.OrderService;
import com.thuanthanh.vegetables.StringUtil.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CartRepository cartRepository;

    private Utils utils = new Utils();
    @Override
    public Order add(Order order, Integer urid, Integer cartid) {
        try{
            Order o = new Order();
            o.setAddress(order.getAddress());
            o.setFullName(order.getFullName());
            o.setSdt(utils.checkPhone(order.getSdt()));
            o.setOrderDate(new Date());
            o.setOrderStatus(1);
            o.setNote(order.getNote());
            o.setCart(cartRepository.findById(cartid).get());
            o.setUser(userRepository.findById(urid).get());
            return orderRepository.save(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Map<String,Object>> getAll(Integer id) {
        try {
            return orderRepository.getall(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Order order, Integer id){
            Order or = orderRepository.findById(id).get();
            or.setOrderStatus(order.getOrderStatus());
            or.setDateOfReceiptOfGoods(new Date());
            or.setDeliveryDate(new Date());
            orderRepository.save(or);
    }

    @Override
    public void delete(Integer id) {
            try{
                orderRepository.delete(id);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }

    @Override
    public void update_status(List<Integer> id) {
        try{
            orderRepository.update_status(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
