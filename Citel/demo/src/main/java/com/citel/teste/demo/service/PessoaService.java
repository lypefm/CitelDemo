package com.citel.teste.demo.service;

import com.citel.teste.demo.entities.Pessoa;
import com.citel.teste.demo.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repository;

    public Pessoa salvarPessoa(Pessoa pessoa){
        return this.repository.save(pessoa);
    }

    @Transactional(readOnly = true)
    public List<Object[]> recuperarMediaIdadePorTipoSangue(){
        return this.repository.findMediaIdadePorTipoSanguineo();
    }

    @Transactional(readOnly = true)
    public List<Object[]> recuperarDoadorPorTipoSangue(){
        return this.repository.findDoadorParaCadaTipoSangue();
    }
}
