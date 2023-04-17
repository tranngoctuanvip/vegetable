package com.thuanthanh.vegetables.Repository;

import com.thuanthanh.vegetables.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
    @Query(value = "select p.name ,p.image,p.price ,c.quality,c.sum from orderv o inner join cart c on c.id = o.cart_id \n" +
            "\tinner join product p on p.id = c.product_id where o.user_id = :urid",nativeQuery = true)
    List<Map<String,Object>> getall(@Param("urid") Integer urid);
    @Query(value = "update orderv set order_status = 0 where user_id = :urid",nativeQuery = true)
    void delete(Integer urid);

    @Query(value = "select month(o.date_of_receipt_of_goods) as 'Tháng' , Sum(c.sum ) as 'Doanh thu'from orderv o join cart c on o.cart_id = c.id \n" +
            "     where o.order_status =2 and month (o.date_of_receipt_of_goods) = :month\n" +
            "     group by month(o.date_of_receipt_of_goods)",nativeQuery = true)
    Map<String,Object> getmonth(@Param("month") String month);

    @Query(value = "select QUARTER(o.date_of_receipt_of_goods) as 'Qúy', sum(c.sum) as 'Doanh thu' from orderv o join cart c on o.cart_id =c.id \n" +
            "     where o.order_status =2 and quarter(o.date_of_receipt_of_goods) = :quarter\n" +
            "     group by quarter(o.date_of_receipt_of_goods)",nativeQuery = true)
    Map<String,Object> getquarter(@Param("quarter") String quarter);

    @Query(value = "     select Year(o.date_of_receipt_of_goods) as 'Năm', Sum(c.sum) as 'Doanh thu' from orderv o join cart c on o.cart_id = c.id \n" +
            "     where o.order_status = 2 and year (o.date_of_receipt_of_goods) =:year\n" +
            "     Group by Year(o.date_of_receipt_of_goods)",nativeQuery = true)
    Map<String,Object> getyear(@Param("year") String year);
}
