package com.thuanthanh.vegetables.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "address",length = 150)
    private String address;
    @Column(name = "sdt",length = 50)
    private String sdt;
    @Column(name = "email",length = 100)
    private String email;

    @OneToOne
    @JoinColumn(name = "roleId")
    private Role role;

}
