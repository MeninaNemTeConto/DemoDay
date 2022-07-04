package com.example.demo.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    // Porque :(
    @GetMapping("/")
    public String home() {
        return "src/ladingpage/index";
    }

    @GetMapping("/src/login/pre-cadastro.html")
    public String preCadastro() { return "src/login/pre-cadastro.html";}

    @GetMapping("/src/login/cadastro-contra.html")
    public String cadastroContra() {return "src/login/cadastro-contra.html";}

    @GetMapping("/src/login/cadastro-free.html")
    public String cafastroFreela() {return "src/login/cadastro-free.html";}

    @GetMapping("/src/login/login.html")
    public String login() {return "src/login/login.html";}

    @GetMapping("/src/cursos/cursos.html")
    public String cursos(){return "src/cursos/cursos.html";}

    @GetMapping("/src/ladingpage/index.html")
    public String landing(){return "src/ladingpage/index.html";}

    @GetMapping("/src/perfil_inicio/perfil_inicio.html")
    public String perfilInicio(){return "src/perfil_inicio/perfil_inicio.html";}

    @GetMapping("/src/perfil_projetos/perfil_projetos.html")
    public String perfilProjetos(){return "src/perfil_projetos/perfil_projetos.html";}

    @GetMapping("/src/perfil_privacidade/perfil_privacidade.html")
    public String perfilPrivacidade(){return "src/perfil_privacidade/perfil_privacidade.html";}

    @GetMapping("/src/perfil_suporte/perfil_suporte.html")
    public String perfilSuporte(){return "src/perfil_suporte/perfil_suporte.html";}

    @GetMapping("/src/vagas/vagas.html")
    public String vagas(){return "src/vagas/vagas.html";}

    @GetMapping("/src/mapaDeIniciativas/index.html")
    public String mapaIniciativa(){return "src/mapaDeIniciativas/index.html";}

    @GetMapping("/src/terms_e_privacidade/termosuso_e_privacidade.html")
    public String termoDeUso(){return "src/terms_e_privacidade/termosuso_e_privacidade.html";}

    @GetMapping("/src/criar_vaga/criar_vaga.html")
    public String criarVagas(){return "src/criar_vaga/criar_vaga.html";}


}
