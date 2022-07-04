package com.example.demo.model.repository;

import com.example.demo.model.entity.FotosServicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotosServicosRepository extends JpaRepository<FotosServicos, Long> {
}
