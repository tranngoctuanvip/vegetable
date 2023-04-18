package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Repository.OrderRepository;
import com.thuanthanh.vegetables.Service.StatisticalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class StatisticalServiceImpl implements StatisticalService {
    public static final Logger logger = LoggerFactory.getLogger(StatisticalServiceImpl.class);
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public Map<String, Object> getall(String month) {
        try {
            return orderRepository.getmonth(month);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
    @Override
    public Map<String, Object> getquarter(String quarter) {
        try {
            return orderRepository.getquarter(quarter);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
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
            logger.error(e.getMessage());
            return null;
        }
    }
}
