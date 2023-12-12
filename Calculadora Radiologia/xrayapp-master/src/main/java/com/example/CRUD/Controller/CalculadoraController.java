package com.example.CRUD.Controller;

import com.example.CRUD.Model.Calculadora;
import com.example.CRUD.Model.DadosHTML;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


public class CalculadoraController {
    DadosHTML dm = new DadosHTML();
    @PostMapping("/login")
    public String DadosSlide(
            @RequestParam(name = "kvValue", defaultValue = "100") int kvValue,
            @RequestParam(name = "msValue", defaultValue = "100") int msValue,
            @RequestParam(name = "maValue", defaultValue = "200") int maValue,
            Model model) {

        // Adiciona os valores ao modelo para serem exibidos na página
        model.addAttribute("kvValue", kvValue);
        model.addAttribute("msValue", msValue);
        model.addAttribute("maValue", maValue);

        // Armazene os valores em variáveis
        dm.setKv(kvValue);
        dm.setMs(msValue);
        dm.setMa(maValue);

        return "/login";
    }

    @PostMapping("/login")
    public String DadosLabel(@RequestParam("espessura") String espessura) {
        int intespessura = Integer.parseInt(espessura);
        dm.setEspessura(intespessura);

        return "/login";
    }
    @GetMapping("/login")
    public String mostrarFormulario(Model model) {
        model.addAttribute("regiaoSelecionada", new DadosHTML());
        return "/login";
    }

    @PostMapping("/login")
    public String processarFormulario(DadosHTML dm) {

        dm.setRegiao(dm.getRegiao());
        return "/login";
    }

    @GetMapping("/calcular")
    public String calcularResultado( Model model) {
        // Lógica do cálculo
        Calculadora calc = new Calculadora();
        String resultado = "1";
        System.out.println(resultado);
        // Adiciona o resultado ao modelo
        model.addAttribute("resultado", resultado);

        // Retorna a página com o resultado
        return "/label";
    }
}
