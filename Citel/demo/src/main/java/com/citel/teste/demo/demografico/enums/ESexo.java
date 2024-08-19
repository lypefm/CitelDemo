package com.citel.teste.demo.demografico.enums;

public enum ESexo {
    Masculino("M"),
    Feminino("F");

    private final String descricao;
    ESexo(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
