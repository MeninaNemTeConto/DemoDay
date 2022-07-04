package com.example.demo.model.service;

import com.example.demo.model.entity.Certificados;

import java.util.List;

public interface CertificadoService {

    Certificados saveCertificado(Certificados certificados);

    Certificados updateCertificados(Certificados certificados, Long id);

    List<Certificados> listaCertificados();

    void deleteCertificado(Long id);

}
