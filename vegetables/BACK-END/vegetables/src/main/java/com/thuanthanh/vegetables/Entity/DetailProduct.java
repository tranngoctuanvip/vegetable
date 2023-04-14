package com.thuanthanh.vegetables.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "detailproduct")
public class DetailProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "detail",length = 10000)
    private String detail;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "YYY-MM-dd HH:mm")
    private Date createTime;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
    private Date updateTime;
    @Column(name = "status", length = 10)
    private Integer status;
    @Column(name = "deleted",length = 10)
    private Integer deleted;
    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;
}
