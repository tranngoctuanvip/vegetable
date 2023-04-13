package com.thuanthanh.vegetables.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name",length = 255)
    private String name;
}
