package com.thuanthanh.vegetables.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "quality",length = 50)
    private Integer quality;
    @Column(name = "sum")
    private Double sum;
    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;
    @Column(name = "status",length = 10)
    private Integer status;
    @Column(name = "deleted",length = 10)
    private Integer deleted;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

}
