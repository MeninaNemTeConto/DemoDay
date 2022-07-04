package com.example.demo.model.service;

import com.example.demo.model.entity.CapaCurso;
import com.example.demo.model.repository.CapaCursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapaCursoServiceImpl implements CapaCursoService{

    @Autowired CapaCursoRepository capaCursoRepository;

    @Override
    public CapaCurso saveCapaCurso(CapaCurso capaCurso) {
        return capaCursoRepository.save(capaCurso);
    }
}
