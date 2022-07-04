package com.example.demo.controller;

import com.example.demo.model.entity.FotosIdenGer;
import com.example.demo.model.entity.IdentificacaoGeral;
import com.example.demo.model.service.FotoIdenGerServiceImpl;
import com.example.demo.model.service.IdentificacaoGeralServiceImpl;
import com.example.demo.model.util.Util;
import com.example.demo.view.ViewController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/cadastro")
public class CadastroController {

    @Autowired private IdentificacaoGeralServiceImpl identificacaoGeralService;

    @Autowired private FotoIdenGerServiceImpl fotoIdenGerService;

    @Autowired private ViewController viewController;

    @PostMapping(value = "/cadastrarUser")
    public String cadastrarUser(ModelMap model, @RequestParam(value = "nome")String nome,
                                      @RequestParam(value = "sobrenome")String sobrenome, @RequestParam(value = "nomeSocial") String nomeSocial,
                                      @RequestParam(value = "cpf")String cpf, @RequestParam(value = "dtNascimento") String dtNascimento,
                                      @RequestParam(value = "telefone")String telefone, @RequestParam(value = "cep") String cep,
                                      @RequestParam(value = "email")String email, @RequestParam(value = "senha") String senha) throws Exception {
        // Acima ele pede todos os argumentos para o cadastro

        // Seta a data de cadastro
        String dtCadastro = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

        // Cria uma instancia de identificaçãoGeral
        IdentificacaoGeral identificacaoGeral = new IdentificacaoGeral(nome, sobrenome, nomeSocial, cpf, dtNascimento, telefone,
                cep, email, senha, dtCadastro);


        // Faz criptografia da senha para o banco
        identificacaoGeral.setSenha(Util.md5(identificacaoGeral.getSenha()));

        // Passa as Fotos para binario
//        FotosIdenGer fotosIdenGer = new FotosIdenGer(imagemPerfil.getBytes(), identificacaoGeral);

        // Cria lista para email
        List<String> listOfEmail = identificacaoGeralService.findByEmail(email).stream()
                .map(IdentificacaoGeral::getEmail)
                .collect(Collectors.toList());

        // Verifica se existe CPF cadastrado
        List<String> listOfCpf = identificacaoGeralService.findByCpf(cpf).stream()
                .map(IdentificacaoGeral::getCpf)
                .collect(Collectors.toList());

        // Verifica se o email foi cadastrado e salva foto
        if (listOfEmail.isEmpty() == true && listOfCpf.isEmpty() == true) {
            identificacaoGeralService.saveDepartment(identificacaoGeral);
//            fotoIdenGerService.saveFotoIdenGer(fotosIdenGer);
            return viewController.login();
        }

        return viewController.cadastroContra();
    }

}