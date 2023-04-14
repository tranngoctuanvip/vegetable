package com.thuanthanh.vegetables.Repository;

import com.thuanthanh.vegetables.Entity.DetailProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Repository
public interface DetailProductRepository extends JpaRepository<DetailProduct,Integer> {
    @Modifying
    @Transactional
    @Query(value = "update detailproduct set status = 0, deleted = 1 where id in (:id)",nativeQuery = true)
    void delete(@Param("id")List<Integer> id);

    @Query(value = "select * from detailproduct d where d.status = 1 and d.deleted =0",nativeQuery = true)
    List<DetailProduct> getall();
}
