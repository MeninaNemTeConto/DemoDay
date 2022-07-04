package com.example.demo.model.repository;

import com.example.demo.model.entity.Certificados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificadosRepository extends JpaRepository<Certificados, Long> {
}
