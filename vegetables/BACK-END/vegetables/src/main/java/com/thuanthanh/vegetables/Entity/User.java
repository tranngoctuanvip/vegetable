package com.thuanthanh.vegetables.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
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
    @Column(name = "sdt",length = 150)
    private String sdt;
    @Column(name = "email",length = 100)
        private String email;

    @OneToOne
    @JoinColumn(name = "roleId")
    private Role role;

    public User() {

    }

    public User(String username, String name, String encode, String address, String email, String sdt, Role roles) {
        this.userName=username;
        this.name=name;
        this.password=encode;
        this.address=address;
        this.email=email;
        this.sdt=sdt;
        this.role=roles;
    }
}
