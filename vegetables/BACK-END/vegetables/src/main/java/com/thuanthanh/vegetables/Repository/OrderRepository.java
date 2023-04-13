package com.thuanthanh.vegetables.Repository;

import com.thuanthanh.vegetables.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
    @Query(value = "select p.name ,p.image,p.price ,c.quality,c.sum from orderv o inner join cart c on c.id = o.cart_id \n" +
            "\tinner join product p on p.id = c.product_id where o.user_id =:urid",nativeQuery = true)
    Order getall(@Param("urid") Integer urid);

    @Query(value = "update orderv set order_status = 0 where user_id = :urid",nativeQuery = true)
    void delete(Integer urid);
}
