package com.example.demo.model.service;

import com.example.demo.model.entity.IdentificacaoGeral;

import java.util.List;
import java.util.Optional;

public interface IdentificacaoGeralService {

    IdentificacaoGeral saveDepartment(IdentificacaoGeral department);

    IdentificacaoGeral updateIdentificacaoGeral(IdentificacaoGeral identificacaoGeral);

    List<IdentificacaoGeral> findByEmail(String email);

    IdentificacaoGeral findByEmailInd(String email);

    List<IdentificacaoGeral> findByCpf(String cpf);

    IdentificacaoGeral findByEmailAndLogin (String email, String senha);

    void deleteIdentificacaoGeralById(long identificacaoGeralid);


}
