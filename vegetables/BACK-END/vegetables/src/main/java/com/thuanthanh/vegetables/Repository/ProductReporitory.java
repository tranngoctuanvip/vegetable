package com.thuanthanh.vegetables.Repository;

import com.thuanthanh.vegetables.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Repository
public interface ProductReporitory extends JpaRepository<Product,Integer> {
    @Modifying
    @Transactional
    @Query(value = "update product set status = 0, deleted = 1 where  id in (:id)",nativeQuery = true)
    void delete(@Param("id") List<Integer> id);

    @Query(value = "select p.name ,p.image ,p.price ,p.quality ,c.name as 'Category' from product p inner join category c on p.category_id =c.id \n" +
            "\twhere p.status =1 and p.deleted =0 and c.deleted = 0 and c.status =1 and (:pname is null or p.name like :pname)",nativeQuery = true)
    List<Map<String,Object>> search(@Param("pname") String pname);

    @Query(value = "SELECT p2.name ,p2.image ,p2.price ,p2.quality FROM cart c2 join orderv o2 on o2.cart_id = c2.id \n" +
            "     join product p2 on c2.product_id = p2.id where o2.order_status = 2 and c2.status =1 and c2.deleted = 0 order by c2.quality desc limit 5",nativeQuery = true)
    List<Map<String,Object>> productsell();

    @Query(value = "select p.name, p.price ,p.quality, p.image from product p where p.price between :start and :end and p.status =1 and p.deleted = 0",nativeQuery = true)
    List<Object[]> searchbyprice(@Param("start") Integer start,@Param("end") Integer end);
}
