package com.example.CRUD.Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProjeto", nullable = false, unique = true)
    private Integer idProjeto;

    @ManyToOne
    @JoinColumn(name = "Cliente_idCliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idLider", nullable = false)
    private Colaborador lider;

    @Column(name = "matricula", nullable = false)
    private String matricula;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "escopo", nullable = false)
    private String escopo;

    @Column(name = "dataInicio")
    private Date dataInicio;

    @Column(name = "Projetocol")
    private String Projetocol;

    @Column(name = "dataPrevConclusao")
    private Date dataPrevConclusao;

    @Column(name = "dataConclusao")
    private Date dataConclusao;

    // getters and setters

    public Integer getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Integer idProjeto) {
        this.idProjeto = idProjeto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Colaborador getLider() {
        return lider;
    }

    public void setLider(Colaborador lider) {
        this.lider = lider;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscopo() {
        return escopo;
    }

    public void setEscopo(String escopo) {
        this.escopo = escopo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getProjetocol() {
        return Projetocol;
    }

    public void setProjetocol(String projetocol) {
        Projetocol = projetocol;
    }

    public Date getDataPrevConclusao() {
        return dataPrevConclusao;
    }

    public void setDataPrevConclusao(Date dataPrevConclusao) {
        this.dataPrevConclusao = dataPrevConclusao;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
}
