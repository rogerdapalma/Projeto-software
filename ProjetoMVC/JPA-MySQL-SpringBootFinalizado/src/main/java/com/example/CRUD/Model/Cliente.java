package com.example.CRUD.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente", nullable = false, unique = true)
    private Integer idCliente;

    @ManyToOne
    @JoinColumn(name = "PessoaFisica_idPessoaFisica", nullable = false)
    private PessoaFisica pessoaFisica;

    @ManyToOne
    @JoinColumn(name = "PessoaJuridica_idPessoaJuridica", nullable = false)
    private PessoaJuridica pessoaJuridica;

    @Column(name = "endereco", nullable = false)
    private String endereco;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "fone", nullable = false)
    private String fone;

    // getters and setters

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
