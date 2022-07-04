package com.example.demo.model.repository;

import com.example.demo.model.entity.CadastroFreelas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroFreelasRepository extends JpaRepository<CadastroFreelas, Long> {
}
