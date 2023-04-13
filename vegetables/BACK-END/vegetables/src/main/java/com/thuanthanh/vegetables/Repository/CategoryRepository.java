package com.thuanthanh.vegetables.Repository;

import com.thuanthanh.vegetables.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
    @Modifying
    @Transactional
    @Query(value = "update category set status = 0, deleted = 1 where id in (:id)",nativeQuery = true)
    void delete(@Param("id") List<Integer> id);

    @Query(value = "select * from category c where c.status = 1 and c.deleted =0 and (:name is null or c.name like :name)",nativeQuery = true)
    List<Category> search(@Param("name") String name);
}
