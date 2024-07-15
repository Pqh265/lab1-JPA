package com.t2208e.T2208E_Java_JPA.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "corporation_id")
    private Corporation corporation;

    @OneToMany(mappedBy = "company")
    private List<Department> departments;

    // getters and setters
}

