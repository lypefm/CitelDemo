package com.citel.teste.demo.sangue.validation;

import com.citel.teste.demo.demografico.enums.ETipoSangue;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ValidacaoSangue {
    public List<ETipoSangue> podeDoar(ETipoSangue tipo){
        return switch (tipo) {
            case A_NEGATIVO ->
                    this.converterLista(List.of(this, ETipoSangue.A_POSITIVO, ETipoSangue.AB_POSITIVO, ETipoSangue.AB_NEGATIVO));
            case A_POSITIVO, B_POSITIVO, AB_NEGATIVO -> this.converterLista(List.of(this, ETipoSangue.AB_POSITIVO));
            case B_NEGATIVO ->
                    this.converterLista(List.of(this, ETipoSangue.B_POSITIVO, ETipoSangue.AB_POSITIVO, ETipoSangue.AB_NEGATIVO));
            case AB_POSITIVO -> this.converterLista(List.of(this));
            case O_POSITIVO ->
                    this.converterLista(List.of(this, ETipoSangue.A_POSITIVO, ETipoSangue.B_POSITIVO, ETipoSangue.AB_POSITIVO));
            case O_NEGATIVO ->
                    this.converterLista(List.of(this, ETipoSangue.A_POSITIVO, ETipoSangue.B_POSITIVO, ETipoSangue.AB_POSITIVO, ETipoSangue.A_NEGATIVO, ETipoSangue.B_NEGATIVO, ETipoSangue.AB_NEGATIVO));
        };
    }
    private List<ETipoSangue> converterLista(List<Object> list){
        return list.stream()
                .filter(ETipoSangue.class::isInstance)
                .map(ETipoSangue.class::cast)
                .collect(Collectors.toList());
    }

}
