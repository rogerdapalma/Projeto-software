package com.example.CRUD.Controller;

import com.example.CRUD.Model.Alocacao;
import com.example.CRUD.Model.Cliente;
import com.example.CRUD.Model.Colaborador;
import com.example.CRUD.Model.PessoaFisica;
import com.example.CRUD.Model.PessoaJuridica;
import com.example.CRUD.Model.Projeto;
import com.example.CRUD.Model.Tarefa;
import com.example.CRUD.Repository.AlocacaoRepository;
import com.example.CRUD.Repository.ClienteRepository;
import com.example.CRUD.Repository.ColaboradorRepository;
import com.example.CRUD.Repository.PessoaFisicaRepository;
import com.example.CRUD.Repository.PessoaJuridicaRepository;
import com.example.CRUD.Repository.ProjetoRepository;
import com.example.CRUD.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroController {

    @Autowired
    private AlocacaoRepository alocacaoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;

    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;

    @Autowired
    private ProjetoRepository projetoRepository;

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping("/registro")
    public String exibirFormulario(Model model) {
        model.addAttribute("alocacao", new Alocacao());
        model.addAttribute("cliente", new Cliente());
        model.addAttribute("colaborador", new Colaborador());
        model.addAttribute("pessoaFisica", new PessoaFisica());
        model.addAttribute("pessoaJuridica", new PessoaJuridica());
        model.addAttribute("projeto", new Projeto());
        model.addAttribute("tarefa", new Tarefa());
        return "formulario";
    }

    @PostMapping("/salvar")
    public String salvarRegistro(
            @ModelAttribute Alocacao alocacao,
            @ModelAttribute Cliente cliente,
            @ModelAttribute Colaborador colaborador,
            @ModelAttribute PessoaFisica pessoaFisica,
            @ModelAttribute PessoaJuridica pessoaJuridica,
            @ModelAttribute Projeto projeto,
            @ModelAttribute Tarefa tarefa
    ) {
        alocacaoRepository.save(alocacao);
        clienteRepository.save(cliente);
        colaboradorRepository.save(colaborador);
        pessoaFisicaRepository.save(pessoaFisica);
        pessoaJuridicaRepository.save(pessoaJuridica);
        projetoRepository.save(projeto);
        tarefaRepository.save(tarefa);

        return "redirect:/sucesso";
    }

    @GetMapping("/sucesso")
    public String exibirSucesso() {
        return "sucesso";
    }
}
