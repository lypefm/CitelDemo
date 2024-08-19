package com.citel.teste.demo.entities;

import com.citel.teste.demo.demografico.enums.ETipoContato;

import com.citel.teste.demo.entities.commons.EntidadeBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONTATO_PESSOA")
public class ContatoPessoa extends EntidadeBase {

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_CONTATO", nullable = false)
    private ETipoContato tipoContato;

    @Column(name = "VALOR", nullable = false)
    private String valor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PESSOA_ID", nullable = false)
    private Pessoa pessoa;

    // Getters and Setters
    public ETipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(ETipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
