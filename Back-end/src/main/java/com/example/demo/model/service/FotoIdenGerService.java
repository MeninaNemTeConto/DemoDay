package com.example.demo.model.service;

import com.example.demo.model.entity.FotosIdenGer;

import java.util.List;

public interface FotoIdenGerService {

    FotosIdenGer saveFotoIdenGer(FotosIdenGer fotosIdenGer);

    FotosIdenGer upDateFotoIdenGer(FotosIdenGer fotosIdenGer, Long id);

    List<FotosIdenGer> listaFotos();

    void deleteFotoIdenGer(Long id);

}
