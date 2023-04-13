package com.thuanthanh.vegetables.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "orderV")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "address",length = 100)
    private String address;

    @Column(name = "sdt",length = 50)
    private String sdt;

    @Column(name = "fullname")
    private String fullName;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
    private Date orderDate; //ngày đặt hàng

//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
//    @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
    private String deliveryDate; //ngày giao hàng

//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
//    @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
    private String dateOfReceiptOfGoods; //ngày nhận hàng

    @Column(name = "orderStatus",length = 11)
    private Integer orderStatus;

    @Column(name = "note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToOne
    @JoinColumn(name = "cartId")
    private Cart cart;
}
