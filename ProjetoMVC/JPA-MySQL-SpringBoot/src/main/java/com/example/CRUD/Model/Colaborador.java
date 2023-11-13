package com.example.CRUD.Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Colaborador")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idColaborador", nullable = false, unique = true)
    private Integer idColaborador;

    @Column(name = "dataAdminissao")
    private Date dataAdminissao;

    @Column(name = "dataDisligamento")
    private Date dataDisligamento;

    // getters and setters

    public Integer getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(Integer idColaborador) {
        this.idColaborador = idColaborador;
    }

    public Date getDataAdminissao() {
        return dataAdminissao;
    }

    public void setDataAdminissao(Date dataAdminissao) {
        this.dataAdminissao = dataAdminissao;
    }

    public Date getDataDisligamento() {
        return dataDisligamento;
    }

    public void setDataDisligamento(Date dataDisligamento) {
        this.dataDisligamento = dataDisligamento;
    }
}
