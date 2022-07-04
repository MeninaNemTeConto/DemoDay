package com.example.demo.controller;

import com.example.demo.model.entity.CapaCurso;
import com.example.demo.model.entity.CategoriaCursos;
import com.example.demo.model.entity.Cursos;
import com.example.demo.model.service.CapaCursoServiceImpl;
import com.example.demo.model.service.CursosCategoriasServiceImpl;
import com.example.demo.model.service.CursosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping( value = "/cursos")
public class ControllerCursos {

    @Autowired private CursosServiceImpl cursosService;
    @Autowired private CursosCategoriasServiceImpl cursosCategoriasService;
    @Autowired private CapaCursoServiceImpl capaCursoService;

    @RequestMapping(value = "/novoCurso", method = RequestMethod.POST)
    public CapaCurso salvaCurso(@RequestParam(value = "nomeCurso") String nomeCurso, @RequestParam(value = "instituicao") String instituicao,
                                @RequestParam(value = "valor") String valor, @RequestParam(value = "tipo_formacao") String formacao,
                                @RequestParam(value = "nome_cate") String categoria, @RequestParam(value = "fotoperfil") MultipartFile imagemPerfil) throws IOException {

        CategoriaCursos categoriaCursos = new CategoriaCursos(categoria);
        Cursos curso = new Cursos(nomeCurso, instituicao, valor, formacao, categoriaCursos);
        CapaCurso capaCurso = new CapaCurso(imagemPerfil.getBytes(), curso);

        cursosCategoriasService.saveCategoriasCursos(categoriaCursos);
        cursosService.saveNewCurso(curso);
        return capaCursoService.saveCapaCurso(capaCurso);
    }

    @RequestMapping(value = "/userView/mostraCursos", method = RequestMethod.GET)
    public List<Cursos> vizualizaCursos(){
        return cursosService.fetchCursosList();
    }

}
