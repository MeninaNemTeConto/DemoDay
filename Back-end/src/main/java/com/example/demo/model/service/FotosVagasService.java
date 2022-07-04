package com.example.demo.model.service;

import com.example.demo.model.entity.FotosIdenGer;
import com.example.demo.model.entity.FotosVagas;

import java.util.List;

public interface FotosVagasService {

    FotosVagas saveFotoVaga(FotosVagas fotosVaga);

    FotosVagas upDateFotosVaga(FotosIdenGer fotosVaga, Long id);

    List<FotosVagas> listaFotosVaga();

    void deleteFotoVaga(Long id);
}
