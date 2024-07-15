package com.t2208e.T2208E_Java_JPA.repository;

import com.t2208e.T2208E_Java_JPA.entity.Corporation;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CorporationRepository extends JpaRepository<Corporation, Long> {
}

