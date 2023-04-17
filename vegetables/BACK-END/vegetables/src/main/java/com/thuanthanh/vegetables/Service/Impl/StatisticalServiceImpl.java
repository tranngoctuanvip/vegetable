package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Repository.OrderRepository;
import com.thuanthanh.vegetables.Service.StatisticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class StatisticalServiceImpl implements StatisticalService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public Map<String, Object> getall(String month) {
        return orderRepository.getmonth(month);
    }

    @Override
    public Map<String, Object> getquarter(String quarter) {
        return orderRepository.getquarter(quarter);
    }

    @Override
    public List<Map<String, Object>> get(String month, String quarter, String year) {
        try {
            Map<String,Object> getmonth = orderRepository.getmonth(month);
            Map<String,Object> getquarter = orderRepository.getquarter(quarter);
            Map<String,Object> getyear = orderRepository.getyear(year);
            List<Map<String,Object>> geta = new ArrayList<>();
            geta.add(getmonth);
            geta.add(getquarter);
            geta.add(getyear);
            return geta;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
