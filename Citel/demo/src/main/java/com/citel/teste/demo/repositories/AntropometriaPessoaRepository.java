package com.citel.teste.demo.repositories;

import com.citel.teste.demo.entities.AntropometriaPessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AntropometriaPessoaRepository extends JpaRepository<AntropometriaPessoa, Long> {

    @Query("SELECT " +
            "CASE " +
            "  WHEN TIMESTAMPDIFF(YEAR, p.dataDeNascimento, CURDATE()) BETWEEN 0 AND 10 THEN '0-10' " +
            "  WHEN TIMESTAMPDIFF(YEAR, p.dataDeNascimento, CURDATE()) BETWEEN 11 AND 20 THEN '11-20' " +
            "  WHEN TIMESTAMPDIFF(YEAR, p.dataDeNascimento, CURDATE()) BETWEEN 21 AND 30 THEN '21-30' " +
            "  WHEN TIMESTAMPDIFF(YEAR, p.dataDeNascimento, CURDATE()) BETWEEN 31 AND 40 THEN '31-40' " +
            "  WHEN TIMESTAMPDIFF(YEAR, p.dataDeNascimento, CURDATE()) BETWEEN 41 AND 50 THEN '41-50' " +
            "  WHEN TIMESTAMPDIFF(YEAR, p.dataDeNascimento, CURDATE()) BETWEEN 51 AND 60 THEN '51-60' " +
            "  WHEN TIMESTAMPDIFF(YEAR, p.dataDeNascimento, CURDATE()) BETWEEN 61 AND 70 THEN '61-70' " +
            "  WHEN TIMESTAMPDIFF(YEAR, p.dataDeNascimento, CURDATE()) BETWEEN 71 AND 80 THEN '71-80' " +
            "  ELSE '81+' " +
            "END AS faixa_etaria, " +
            "AVG(ap.peso / (ap.altura * ap.altura)) AS imc_medio " +
            "FROM Pessoa p " +
            "JOIN AntropometriaPessoa ap ON p.id = ap.pessoa.id " +
            "GROUP BY faixa_etaria")
    List<Object[]> findAverageIMCByAgeRange();

    @Query("SELECT p.sexo, " +
            "SUM(CASE WHEN ap.peso / (ap.altura * ap.altura) > 30 THEN 1 ELSE 0 END) * 100.0 / COUNT(p.id) AS percentual_obesos " +
            "FROM Pessoa p " +
            "JOIN AntropometriaPessoa ap ON p.id = ap.pessoa.id " +
            "GROUP BY p.sexo")
    List<Object[]> findObesityPercentageByGender();

}
