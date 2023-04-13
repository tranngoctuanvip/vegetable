package com.thuanthanh.vegetables.Repository;

import com.thuanthanh.vegetables.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {
    @Query(value = "\tselect * from cart c where c.status =1 and c.deleted =0 and c.user_id = :urid",nativeQuery = true)
    List<Cart> getall(@Param("urid") Integer urid);

    @Query(value = "select Sum(c.sum) as 'Total' from cart c where c.user_id = :urid and c.deleted = 0 and c.status =1",nativeQuery = true)
    Cart sumtotal(@Param("urid") Integer urid);
    @Modifying
    @Transactional
    @Query(value = "update cart set status = 0, deleted = 1 where  id in (:id) ",nativeQuery = true)
    void delete(@Param("id") List<Integer> id);
}
