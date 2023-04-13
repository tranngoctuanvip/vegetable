package com.thuanthanh.vegetables.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "statistical")
public class Statistical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "salesbyday")
    private Double salesByday; //doanh thu theo ngày
    @Column(name = "salesbymonth")
    private Double salesBymonth; //doanh thu theo tháng
    @Column(name = "quarterlysales")
    private Double quarterlySales; //doanh thu theo quý
    @Column(name = "salesbyyear")
    private Double salesByyear; //doanh thu theo năm

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
 }
