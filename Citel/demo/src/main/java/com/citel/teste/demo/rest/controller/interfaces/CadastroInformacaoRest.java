package com.citel.teste.demo.rest.controller.interfaces;

import com.citel.teste.demo.model.CadastroInformacaoDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CadastroInformacaoRest {
    ResponseEntity salvarCadastros(List<CadastroInformacaoDTO> informacoes);
}
