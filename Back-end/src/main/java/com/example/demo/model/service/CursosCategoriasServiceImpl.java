package com.example.demo.model.service;

import com.example.demo.model.entity.CategoriaCursos;
import com.example.demo.model.repository.CursosCategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursosCategoriasServiceImpl implements CursosCategoriasService {

    @Autowired
    private CursosCategoriaRepository cursosCategoriaRepository;


    @Override
    public CategoriaCursos saveCategoriasCursos(CategoriaCursos categoriaCursos) {
        return cursosCategoriaRepository.save(categoriaCursos);
    }

    @Override
    public void deleteCurso(Long id) {
        cursosCategoriaRepository.deleteById(id);
    }
}
