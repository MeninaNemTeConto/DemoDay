package com.example.demo.model.service;

import com.example.demo.model.entity.Cursos;
import com.example.demo.model.repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursosServiceImpl implements CursosService{

    @Autowired
    CursosRepository cursosRepository;

    @Override
    public Cursos saveNewCurso(Cursos curso) {
        return cursosRepository.save(curso);
    }

    @Override
    public List<Cursos> fetchCursosList() {
        return cursosRepository.findAll();
    }

    @Override
    public void deleteCursoById(Long cursoId) {
        cursosRepository.deleteById(cursoId);
    }
}
