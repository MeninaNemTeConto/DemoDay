package com.example.demo.model.service;

import com.example.demo.model.entity.Vagas;
import com.example.demo.model.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagasServiceImpl implements VagasService{

    @Autowired
    VagasRepository vagasRepository;

    @Override
    public Vagas saveVagas(Vagas vagas) {
        return vagasRepository.save(vagas);
    }

    @Override
    public List<Vagas> fetchVagasList() {
        return vagasRepository.findAll();
    }

    @Override
    public void deleteVagasById(Long vagasId) {
        vagasRepository.deleteById(vagasId);
    }

}
