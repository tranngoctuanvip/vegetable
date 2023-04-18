package com.thuanthanh.vegetables.Repository;

import com.thuanthanh.vegetables.Entity.DetailProduct;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface DetailProductRepository extends JpaRepository<DetailProduct,Integer> {
    @Modifying
    @Transactional
    @Query(value = "update detailproduct set status = 0, deleted = 1 where id in (:id)",nativeQuery = true)
    void delete(@Param("id")List<Integer> id);

    @Query(value = "select * from detailproduct d where d.status = 1 and d.deleted =0",nativeQuery = true)
    List<DetailProduct> getall();

    @Query(value = "select * from detailproduct d where d.create_time between :start and (SELECT DATE_ADD(:end , interval '23:59:59' hour)) " +
            "and d.deleted =0 and d.status =1\n" ,nativeQuery = true)
    Page<DetailProduct> search(@Param("start") String start, @Param("end") String end, Pageable pageable);
}
