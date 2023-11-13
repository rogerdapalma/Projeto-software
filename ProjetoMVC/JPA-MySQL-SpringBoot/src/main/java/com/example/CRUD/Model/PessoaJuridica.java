package com.example.CRUD.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "PessoaJuridica")
public class PessoaJuridica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPessoaJuridica", nullable = false, unique = true)
    private Integer idPessoaJuridica;

    @Column(name = "cnpj", nullable = false)
    private String cnpj;

    @Column(name = "nomeFantasia", nullable = false)
    private String nomeFantasia;

    @Column(name = "razaoSocial", nullable = false)
    private String razaoSocial;

    // getters and setters

    public Integer getIdPessoaJuridica() {
        return idPessoaJuridica;
    }

    public void setIdPessoaJuridica(Integer idPessoaJuridica) {
        this.idPessoaJuridica = idPessoaJuridica;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
