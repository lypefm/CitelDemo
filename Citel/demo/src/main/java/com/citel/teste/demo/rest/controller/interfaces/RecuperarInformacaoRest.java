package com.citel.teste.demo.rest.controller.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface RecuperarInformacaoRest {
    @GetMapping("/informacao")
    ResponseEntity getContagemPessoaPorEstado();

    @GetMapping("/imcMedio")
    ResponseEntity getImcMedioFaixaEtaria();

    @GetMapping("/percentualObesos")
    ResponseEntity getPercentualObesos();

    @GetMapping("/mediaIdadeTipoSangue")
    ResponseEntity getMediaIdadeTipoSangue();

    @GetMapping("/doadorPorTipoSanguineo")
    ResponseEntity getDoadorPorTipoSangue();
}
