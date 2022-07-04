package com.example.demo.model.service;

import com.example.demo.model.entity.FotosIdenGer;
import com.example.demo.model.entity.FotosVagas;
import com.example.demo.model.repository.FotosVagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FotosVagasServiceImpl implements FotosVagasService {

    @Autowired
    FotosVagasRepository fotosVagasRepository;

    @Override
    public FotosVagas saveFotoVaga(FotosVagas fotosVaga) {
        return fotosVagasRepository.save(fotosVaga);
    }

    @Override
    public FotosVagas upDateFotosVaga(FotosIdenGer fotosVaga, Long id) {

        FotosVagas atualizaFotosVaga = fotosVagasRepository.findById(id).get();
        return null;
    }

    @Override
    public List<FotosVagas> listaFotosVaga() {
        return fotosVagasRepository.findAll();
    }

    @Override
    public void deleteFotoVaga(Long id) {
        fotosVagasRepository.deleteById(id);
    }
}