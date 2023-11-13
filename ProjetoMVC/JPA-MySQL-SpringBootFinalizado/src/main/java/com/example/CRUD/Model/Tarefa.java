package com.example.CRUD.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTarefa", nullable = false, unique = true)
    private Integer idTarefa;

    @ManyToOne
    @JoinColumn(name = "Colaborador_idColaborador", nullable = false)
    private Colaborador colaborador;

    @ManyToOne
    @JoinColumn(name = "Projeto_idProjeto", nullable = false)
    private Projeto projeto;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "PrevisaoHoras")
    private Double PrevisaoHoras;

    @Column(name = "qtdHoras")
    private Double qtdHoras;

    // getters and setters

    public Integer getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getPrevisaoHoras() {
        return PrevisaoHoras;
    }

    public void setPrevisaoHoras(Double previsaoHoras) {
        PrevisaoHoras = previsaoHoras;
    }

    public Double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }
}
