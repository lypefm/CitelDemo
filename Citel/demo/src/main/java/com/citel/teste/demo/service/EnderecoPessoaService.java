package com.citel.teste.demo.service;

import com.citel.teste.demo.repositories.EnderecoPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EnderecoPessoaService {

    @Autowired
    private EnderecoPessoaRepository repository;
    @Transactional(readOnly = true)
    public List<Object[]> recuperarQtdPorEstado(){
        return repository.countPessoasByEstado();
    }
}
