package com.citel.teste.demo.repositories;

import com.citel.teste.demo.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("SELECT p.tipoSangue, AVG(TIMESTAMPDIFF(YEAR, p.dataDeNascimento, CURDATE())) AS media_idade " +
            "FROM Pessoa p " +
            "GROUP BY p.tipoSangue")
    List<Object[]> findMediaIdadePorTipoSanguineo();

    @Query("SELECT receptor.tipoSangue AS tipo_sanguineo_receptor, COUNT(DISTINCT doador.id) AS quantidade_doador " +
            "FROM Pessoa doador " +
            "JOIN Pessoa receptor " +
            "ON " +
            "(doador.tipoSangue = 'O_NEGATIVO' AND receptor.tipoSangue IN ('O_NEGATIVO', 'O_POSITIVO', 'A_NEGATIVO', 'A_POSITIVO', 'B_NEGATIVO', 'B_POSITIVO', 'AB_NEGATIVO', 'AB_POSITIVO')) OR " +
            "(doador.tipoSangue = 'O_POSITIVO' AND receptor.tipoSangue IN ('O_POSITIVO', 'A_POSITIVO', 'B_POSITIVO', 'AB_POSITIVO')) OR " +
            "(doador.tipoSangue = 'A_NEGATIVO' AND receptor.tipoSangue IN ('A_NEGATIVO', 'A_POSITIVO', 'AB_NEGATIVO', 'AB_POSITIVO')) OR " +
            "(doador.tipoSangue = 'A_POSITIVO' AND receptor.tipoSangue IN ('A_POSITIVO', 'AB_POSITIVO')) OR " +
            "(doador.tipoSangue = 'B_NEGATIVO' AND receptor.tipoSangue IN ('B_NEGATIVO', 'B_POSITIVO', 'AB_NEGATIVO', 'AB_POSITIVO')) OR " +
            "(doador.tipoSangue = 'B_POSITIVO' AND receptor.tipoSangue IN ('B_POSITIVO', 'AB_POSITIVO')) OR " +
            "(doador.tipoSangue = 'AB_NEGATIVO' AND receptor.tipoSangue IN ('AB_NEGATIVO', 'AB_POSITIVO')) OR " +
            "(doador.tipoSangue = 'AB_POSITIVO' AND receptor.tipoSangue = 'AB_POSITIVO') " +
            "WHERE TIMESTAMPDIFF(YEAR, doador.dataDeNascimento, CURDATE()) BETWEEN 16 AND 69 " +
            "AND doador.id IN (SELECT ap.pessoa.id FROM AntropometriaPessoa ap WHERE ap.peso > 50) " +
            "GROUP BY receptor.tipoSangue")
    List<Object[]> findDoadorParaCadaTipoSangue();

}
