package com.thuanthanh.vegetables.Service;

import java.util.List;
import java.util.Map;

public interface StatisticalService {
    Map<String,Object> getall(String month);
    Map<String,Object> getquarter(String quarter);
    List<Map<String,Object>> get(String month, String quarter, String year);
}
