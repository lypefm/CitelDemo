package com.citel.teste.demo.entities;

import com.citel.teste.demo.demografico.enums.ETipoDocumento;
import com.citel.teste.demo.entities.commons.EntidadeBase;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DOCUMENTO_PESSOA")
public class DocumentoPessoa extends EntidadeBase {

    @Column(name = "VALOR", nullable = false)
    private String valor;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_DOCUMENTO", nullable = false)
    private ETipoDocumento tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "PESSOA_ID", nullable = false)
    private Pessoa pessoa;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ETipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(ETipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
