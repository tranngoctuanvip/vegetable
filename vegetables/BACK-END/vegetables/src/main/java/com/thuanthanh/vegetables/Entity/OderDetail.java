package com.thuanthanh.vegetables.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "orderDetail")
public class OderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;

    @OneToOne
    @JoinColumn(name = "orderId")
    private Order order;
}
