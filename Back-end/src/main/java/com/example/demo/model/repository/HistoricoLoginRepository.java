package com.example.demo.model.repository;

import com.example.demo.model.entity.HistoricoLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoLoginRepository extends JpaRepository<HistoricoLogin, Long> {
}
