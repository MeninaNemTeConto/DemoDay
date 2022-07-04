package com.example.demo.model.repository;

import com.example.demo.model.entity.CapaCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapaCursoRepository extends JpaRepository<CapaCurso, Long> {

}
