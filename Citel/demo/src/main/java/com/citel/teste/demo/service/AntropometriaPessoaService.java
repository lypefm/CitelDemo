package com.citel.teste.demo.service;

import com.citel.teste.demo.repositories.AntropometriaPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AntropometriaPessoaService {
    @Autowired
    private AntropometriaPessoaRepository repository;

    @Transactional(readOnly = true)
    public List<Object[]> recuperarPorFaixaEtaria(){
        return repository.findAverageIMCByAgeRange();
    }

    @Transactional(readOnly = true)
    public List<Object[]> recuperarPercentualObesos(){
        return repository.findObesityPercentageByGender();
    }

}
