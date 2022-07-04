package com.example.demo.model.service;

import com.example.demo.model.entity.Vagas;

import java.util.List;

public interface VagasService {

    // Salvar Vaga
    Vagas saveVagas(Vagas vagas);

    // Pegar Vaga
    List<Vagas> fetchVagasList();

    // Deletar Vaga
    void deleteVagasById(Long vagasId);
}
