package com.citel.teste.demo.repositories;

import com.citel.teste.demo.entities.DocumentoPessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoPessoaRepository extends JpaRepository<DocumentoPessoa, Long> {}
