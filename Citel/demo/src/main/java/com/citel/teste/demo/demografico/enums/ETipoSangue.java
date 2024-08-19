package com.citel.teste.demo.demografico.enums;

import com.citel.teste.demo.sangue.validation.ValidacaoSangue;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public enum ETipoSangue {

    A_NEGATIVO("A-"),
    A_POSITIVO("A+"),
    B_NEGATIVO("B-"),
    B_POSITIVO("B+"),
    AB_POSITIVO("AB+"),
    AB_NEGATIVO("AB-"),
    O_POSITIVO("O+"),
    O_NEGATIVO("O-");
    private final String descricao;
    @Autowired
    private ValidacaoSangue validacaoSangue;
    ETipoSangue(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public List<ETipoSangue> getPodeDoar(){
        return validacaoSangue.podeDoar(this);
    }

    public static ETipoSangue fromDescricao(String descricao) {
        for (ETipoSangue tipo : ETipoSangue.values()) {
            if (tipo.getDescricao().equalsIgnoreCase(descricao)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Descrição inválida: " + descricao);
    }
}
