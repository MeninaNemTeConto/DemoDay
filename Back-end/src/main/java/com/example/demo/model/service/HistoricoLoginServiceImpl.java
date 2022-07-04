package com.example.demo.model.service;

import com.example.demo.model.entity.HistoricoLogin;
import com.example.demo.model.repository.HistoricoLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoLoginServiceImpl implements HistoricoLoginService {

    @Autowired HistoricoLoginRepository historicoLoginRepository;

    @Override
    public HistoricoLogin saveLogin(HistoricoLogin historicoLogin) {
        return historicoLoginRepository.save(historicoLogin);
    }

    @Override
    public List<HistoricoLogin> historicoLoginList() {
        return historicoLoginRepository.findAll();
    }

}
