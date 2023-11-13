package com.example.CRUD.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "PessoaFisica")
public class PessoaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPessoaFisica", nullable = false, unique = true)
    private Integer idPessoaFisica;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "nome", nullable = false)
    private String nome;

    // getters and setters

    public Integer getIdPessoaFisica() {
        return idPessoaFisica;
    }

    public void setIdPessoaFisica(Integer idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
