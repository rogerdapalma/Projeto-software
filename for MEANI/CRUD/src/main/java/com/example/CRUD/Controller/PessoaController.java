package com.example.CRUD.Controller;

import com.example.CRUD.Model.PessoaDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PessoaController {

    @GetMapping("/cadastrar")
    public String mostrarFormulario(Model model) {
        model.addAttribute("pessoaDTO", new PessoaDTO());
        return "Cadastrar";
    }

    @PostMapping("/pessoa/save")
    public String salvarPessoa(@ModelAttribute("pessoaDTO") PessoaDTO pessoaDTO, BindingResult result, Model model) {
        // Lógica para salvar a pessoa aqui...

        // Redireciona para a página "index.html" após salvar
        return "redirect:/index";
    }


    @GetMapping("/app")
    public String mostrarAppPage() {
        return "app";
    }

    @GetMapping("/index")
    public String mostrarIndexPage() {
        return "index";
    }
}