package com.thuanthanh.vegetables.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name",length = 255)
    private String name;
    @Column(name = "quality",length = 50)
    private String quality;
    @Column(name = "price",length = 50)
    private Double price;
    @Column(name = "image",length = 255)
    private String image;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
    private Date createTime;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
    private Date updateTime;
    @Column(name = "status",length = 10)
    private Integer status;
    @Column(name = "deleted",length = 10)
    private Integer deleted;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category categoryId;
}
