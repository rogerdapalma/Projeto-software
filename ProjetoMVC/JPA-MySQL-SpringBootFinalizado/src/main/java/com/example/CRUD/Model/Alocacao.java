package com.example.CRUD.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Alocacao")
public class Alocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAlocacao", nullable = false, unique = true)
    private Integer idAlocacao;

    @ManyToOne
    @JoinColumn(name = "Colaborador_idColaborador", nullable = false)
    private Colaborador colaborador;

    @ManyToOne
    @JoinColumn(name = "Projeto_idProjeto", nullable = false)
    private Projeto projeto;

    @Column(name = "horasSemana")
    private Double horasSemana;

    @Column(name = "valorHora")
    private Double valorHora;

    // getters and setters

    public Integer getIdAlocacao() {
        return idAlocacao;
    }

    public void setIdAlocacao(Integer idAlocacao) {
        this.idAlocacao = idAlocacao;
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

    public Double getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(Double horasSemana) {
        this.horasSemana = horasSemana;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
