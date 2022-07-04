package com.example.demo.model.service;

import com.example.demo.model.entity.CadastroFreelas;
import com.example.demo.model.repository.CadastroFreelasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CadastroFreelaServiceImpl implements CadastroFreelaService{

    @Autowired private CadastroFreelasRepository cadastroFreelasRepository;


    @Override
    public CadastroFreelas saveCadastroFreela(CadastroFreelas cadastroFreelas) {
        return cadastroFreelasRepository.save(cadastroFreelas);
    }

    @Override
    public CadastroFreelas updateCadastroFreela(CadastroFreelas cadastroFreelas, Long id) {
        CadastroFreelas alterFreelas = cadastroFreelasRepository.findById(id).get();

        if(Objects.nonNull(cadastroFreelas.getAreaFormacao())
        && !"".equalsIgnoreCase(cadastroFreelas.getAreaFormacao())){
            alterFreelas.setAreaFormacao(cadastroFreelas.getAreaFormacao());
        }

        if(Objects.nonNull(cadastroFreelas.getMei())
        && !"".equalsIgnoreCase(cadastroFreelas.getMei())){
            alterFreelas.setMei(cadastroFreelas.getMei());
        }

        return cadastroFreelasRepository.save(alterFreelas);
    }

    @Override
    public List<CadastroFreelas> listaCadastroFreelas() {
        return cadastroFreelasRepository.findAll();
    }

    @Override
    public void deleteCadastroFreela(Long id) {

        cadastroFreelasRepository.deleteById(id);
    }
}
