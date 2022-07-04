package com.example.demo.controller;

import com.example.demo.model.entity.FotosIdenGer;
import com.example.demo.model.entity.IdentificacaoGeral;
import com.example.demo.model.entity.Vagas;
import com.example.demo.model.service.FotoIdenGerServiceImpl;
import com.example.demo.model.service.IdentificacaoGeralServiceImpl;
import com.example.demo.model.service.VagasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagasController {

    @Autowired IdentificacaoGeralServiceImpl identificacaoGeralService;
    @Autowired private FotoIdenGerServiceImpl fotoIdenGerService;
    @Autowired private VagasService vagasService;

    // Definição do que vai ser recolhido
    @RequestMapping(value = "/novaVaga", method = RequestMethod.POST)
    public Object salvaVagas(ModelMap modelMap, @RequestParam(value = "titulo_vaga")String titulo_vaga, @RequestParam(value = "descricao")String descricao, @RequestParam(name = "pagamento")String pagamento, @RequestParam(name = "urgencia")String urgencia, @RequestParam(name = "status")int status, @RequestParam(name = "dispo") String dispo, @RequestParam(name = "imagemVaga") MultipartFile imagemVaga, HttpSession httpSession) {


        IdentificacaoGeral identificacaoGeral = identificacaoGeralService.findByEmailInd(httpSession.getAttribute("userMail").toString());

        String identi = identificacaoGeral.getEmail();

        ModelAndView modelAndView = new ModelAndView();
        String dtVaga = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());


        Vagas vagas = new Vagas(titulo_vaga, dtVaga, descricao, pagamento, urgencia, dispo, identificacaoGeral);

        FotosIdenGer fotosIdenGer = new FotosIdenGer();

        return vagasService.saveVagas(vagas);

        // return httpSession.getAttribute("usemail");
        // TODO: fazer metodo para acrescentar imagens no cadastro da vaga (ao menos uma)
        // Usar como base foto de perfil e mudar o enctype no HTML.
    }

    @RequestMapping(value = "/userView/mostraVagas", method = RequestMethod.GET)
    public List<Vagas> vizualizaVagas() {
        return vagasService.fetchVagasList();
    }

}
