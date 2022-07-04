package com.example.demo.model.service;

import com.example.demo.model.entity.CadastroFreelas;

import java.util.List;

public interface CadastroFreelaService {



    CadastroFreelas saveCadastroFreela(CadastroFreelas cadastroFreelas);

    CadastroFreelas updateCadastroFreela(CadastroFreelas cadastroFreelas, Long id);

    List<CadastroFreelas> listaCadastroFreelas();

    void deleteCadastroFreela(Long id);

}
