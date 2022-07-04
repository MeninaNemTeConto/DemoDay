package com.example.demo.model.service;

import com.example.demo.model.entity.Cursos;

import java.util.List;

public interface CursosService {

    Cursos saveNewCurso(Cursos curso);

    List<Cursos> fetchCursosList();

    void deleteCursoById(Long newsletterId);

}
