package com.example.demo.controller;

import com.example.demo.model.entity.HistoricoLogin;
import com.example.demo.model.entity.IdentificacaoGeral;
import com.example.demo.model.service.HistoricoLoginServiceImpl;
import com.example.demo.model.service.IdentificacaoGeralServiceImpl;

import com.example.demo.model.util.Util;
import com.example.demo.view.ViewController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// Anotação
@Controller
@RequestMapping("/auth")
public class LoginController {

   @Autowired IdentificacaoGeralServiceImpl identificacaoGeralService;

   @Autowired HistoricoLoginServiceImpl historicoLoginService;

   @Autowired ViewController viewController;

   @PostMapping("/login")
        public Object login(@ModelAttribute(value = "email")String email, @ModelAttribute(value = "senha")String senha,
                        BindingResult bindingResult, HttpSession httpSession) throws Exception {

        String dtLogin = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());

        IdentificacaoGeral identificacaoGeral = identificacaoGeralService.findByEmailAndLogin(email, Util.md5(senha));


       if(identificacaoGeral == null) {
            return viewController.login();
       } else {
                HistoricoLogin historicoLogin = new HistoricoLogin(dtLogin , identificacaoGeral);
                httpSession.setAttribute("userMail", identificacaoGeral.getEmail());
                historicoLoginService.saveLogin(historicoLogin);

                httpSession.setAttribute("senha", identificacaoGeral.getSenha());

                return  viewController.perfilInicio();

       }

   }

//    @GetMapping("/teste")
//    public Object teste(HttpSession request) {
//        return request.getAttribute("userMail");
//    }
//
//    @PostMapping("/logout")
//    public String logout(HttpSession request){
//       request.invalidate();
//       return "Sessão fechada";
//    }

}