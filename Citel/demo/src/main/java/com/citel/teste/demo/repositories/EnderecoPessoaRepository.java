package com.citel.teste.demo.repositories;

import com.citel.teste.demo.entities.EnderecoPessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoPessoaRepository extends JpaRepository<EnderecoPessoa, Long> {
    @Query("SELECT ep.estado, COUNT(ep.pessoa.id) FROM EnderecoPessoa ep GROUP BY ep.estado")
    List<Object[]> countPessoasByEstado();
}
