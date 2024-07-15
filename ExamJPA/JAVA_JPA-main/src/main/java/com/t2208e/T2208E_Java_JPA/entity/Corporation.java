package com.t2208e.T2208E_Java_JPA.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Corporation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "corporation")
    private List<Company> companies;

    // getters and setters
}

