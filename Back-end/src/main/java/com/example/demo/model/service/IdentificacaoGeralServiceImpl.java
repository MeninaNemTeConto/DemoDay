package com.example.demo.model.service;

import com.example.demo.model.entity.IdentificacaoGeral;
import com.example.demo.model.repository.IdentificacaoGeralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class IdentificacaoGeralServiceImpl implements IdentificacaoGeralService {


    @Autowired
    private IdentificacaoGeralRepository identificacaoGeralRepository;


    @Override
    public IdentificacaoGeral saveDepartment(IdentificacaoGeral identificacaoGeral) {
        return identificacaoGeralRepository.save(identificacaoGeral);}

    @Override
    public IdentificacaoGeral updateIdentificacaoGeral(IdentificacaoGeral identificacaoGeral) {
        IdentificacaoGeral alterIden = new IdentificacaoGeral();

        if(Objects.nonNull(identificacaoGeral.getNome())
        && !"".equalsIgnoreCase(identificacaoGeral.getNome())){
            alterIden.setNome(identificacaoGeral.getNome());
        }

        if(Objects.nonNull((identificacaoGeral.getSobrenome()))
        && !"".equalsIgnoreCase(identificacaoGeral.getSobrenome())){
            alterIden.setSobrenome(identificacaoGeral.getSobrenome());
        }

        if(Objects.nonNull((identificacaoGeral.getCpf()))
        && !"".equalsIgnoreCase(identificacaoGeral.getCpf())){
            alterIden.setCpf(identificacaoGeral.getCpf());
        }

        if(Objects.nonNull(identificacaoGeral.getDt_nascimento())
        && !"".equalsIgnoreCase(identificacaoGeral.getDt_nascimento())){
            alterIden.setDt_nascimento(identificacaoGeral.getDt_nascimento());
        }

        if(Objects.nonNull((identificacaoGeral.getTelefone()))
        && !"".equalsIgnoreCase(identificacaoGeral.getTelefone())){
            alterIden.setTelefone(identificacaoGeral.getTelefone());
        }

        if(Objects.nonNull((identificacaoGeral.getCep()))
        && !"".equalsIgnoreCase(identificacaoGeral.getCep())){
            alterIden.setCep(identificacaoGeral.getCep());
        }

        if(Objects.nonNull(identificacaoGeral.getEmail())
        && !"".equalsIgnoreCase((identificacaoGeral.getEmail()))){
            alterIden.setEmail(identificacaoGeral.getEmail());
        }

        if(Objects.nonNull((identificacaoGeral.getSenha()))
        && !"".equalsIgnoreCase(identificacaoGeral.getSenha())){
            alterIden.setSenha(identificacaoGeral.getSenha());
        }

        return identificacaoGeralRepository.save(alterIden);
    }

    @Override
    public List<IdentificacaoGeral> findByEmail(String email) {
        return identificacaoGeralRepository.findByEmail(email);
    }

    @Override
    public IdentificacaoGeral findByEmailInd(String email) {
        return identificacaoGeralRepository.findByEmailInd(email);
    }

    @Override
    public List<IdentificacaoGeral> findByCpf(String cpf) {
        return identificacaoGeralRepository.findByCpf(cpf);
    }

    @Override
    public IdentificacaoGeral findByEmailAndLogin(String email, String senha) {
        return identificacaoGeralRepository.fazerLogin(email, senha);
    }


    @Override
    public void deleteIdentificacaoGeralById(long identificacaoGeralid) {identificacaoGeralRepository.deleteById(identificacaoGeralid);}
}
