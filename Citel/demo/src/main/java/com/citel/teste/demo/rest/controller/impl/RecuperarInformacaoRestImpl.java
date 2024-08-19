package com.citel.teste.demo.rest.controller.impl;

import com.citel.teste.demo.rest.controller.interfaces.RecuperarInformacaoRest;
import com.citel.teste.demo.service.AntropometriaPessoaService;
import com.citel.teste.demo.service.EnderecoPessoaService;
import com.citel.teste.demo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recuperar")
public class RecuperarInformacaoRestImpl implements RecuperarInformacaoRest {

    @Autowired
    private PessoaService pessoaService;
    @Autowired
    private EnderecoPessoaService enderecoPessoaService;

    @Autowired
    private AntropometriaPessoaService antropometriaPessoaService;

    @Override
    @GetMapping("/contagemPessoaEstado")
    public ResponseEntity getContagemPessoaPorEstado(){
        return ResponseEntity.ok(this.enderecoPessoaService.recuperarQtdPorEstado());
    }

    @Override
    @GetMapping("/imcMedio")
    public ResponseEntity getImcMedioFaixaEtaria(){
        return ResponseEntity.ok(this.antropometriaPessoaService.recuperarPorFaixaEtaria());
    }

    @Override
    @GetMapping("/percentualObesos")
    public ResponseEntity getPercentualObesos(){
        return ResponseEntity.ok(this.antropometriaPessoaService.recuperarPercentualObesos());
    }

    @Override
    @GetMapping("/mediaIdadeTipoSangue")
    public ResponseEntity getMediaIdadeTipoSangue(){
        return ResponseEntity.ok(this.pessoaService.recuperarMediaIdadePorTipoSangue());
    }

    @Override
    @GetMapping("/doadorPorTipoSanguineo")
    public ResponseEntity getDoadorPorTipoSangue(){
        return ResponseEntity.ok(this.pessoaService.recuperarDoadorPorTipoSangue());
    }

}
