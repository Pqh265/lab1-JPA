package com.t2208e.T2208E_Java_JPA.repository;

import com.t2208e.T2208E_Java_JPA.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

