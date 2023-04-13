package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.Order;
import com.thuanthanh.vegetables.Repository.CartRepository;
import com.thuanthanh.vegetables.Repository.OrderRepository;
import com.thuanthanh.vegetables.Repository.UserRepository;
import com.thuanthanh.vegetables.Service.OrderService;
import com.thuanthanh.vegetables.StringUtil.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.Utilities;
import java.util.Date;
import java.util.List;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CartRepository cartRepository;

    Utils utils = new Utils();
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
    public Order getAll(Integer id) {
        try {
            return orderRepository.getall(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Order order, Integer id) {
            Order or = orderRepository.findById(id).get();
            or.setOrderStatus(order.getOrderStatus());
            or.setDateOfReceiptOfGoods(order.getDateOfReceiptOfGoods());
            or.setDeliveryDate(order.getDeliveryDate());
            orderRepository.save(or);
    }

    @Override
    public void delete(List<Integer> id) {
            try{
                orderRepository.delete(id);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }
}
