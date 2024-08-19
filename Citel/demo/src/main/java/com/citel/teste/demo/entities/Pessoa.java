package com.citel.teste.demo.entities;

import com.citel.teste.demo.demografico.enums.ESexo;
import com.citel.teste.demo.entities.commons.EntidadeBase;
import com.citel.teste.demo.demografico.enums.ETipoSangue;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PESSOA")
public class Pessoa extends EntidadeBase {

    @Column(name = "NOME", nullable = false)
    private String nome;
    @Column(name = "NOME_PAI")
    private String nomePai;

    @Column(name = "NOME_MAE")
    private String nomeMae;

    @Column(name = "DATA_DE_NASCIMENTO", nullable = false)
    private LocalDate dataDeNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEXO")
    private ESexo sexo;
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_SANGUE", nullable = false)
    private ETipoSangue tipoSangue;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DocumentoPessoa> documentos = new ArrayList<>();

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EnderecoPessoa> enderecos = new ArrayList<>();

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ContatoPessoa> contatos = new ArrayList<>();

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AntropometriaPessoa> antropometrias = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public ESexo getSexo() {
        return sexo;
    }

    public void setSexo(ESexo sexo) {
        this.sexo = sexo;
    }

    public ETipoSangue getTipoSangue() {
        return this.tipoSangue;
    }

    public void setTipoSangue(ETipoSangue tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public List<DocumentoPessoa> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<DocumentoPessoa> documentos) {
        this.documentos = documentos;
    }

    public List<EnderecoPessoa> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoPessoa> enderecos) {
        this.enderecos = enderecos;
    }

    public List<ContatoPessoa> getContatos() {
        return contatos;
    }

    public void setContatos(List<ContatoPessoa> contatos) {
        this.contatos = contatos;
    }

    public List<AntropometriaPessoa> getAntropometrias() {
        return antropometrias;
    }

    public void setAntropometrias(List<AntropometriaPessoa> antropometrias) {
        this.antropometrias = antropometrias;
    }
}