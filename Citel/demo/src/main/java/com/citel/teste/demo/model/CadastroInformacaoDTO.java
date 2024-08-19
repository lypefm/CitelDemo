package com.citel.teste.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CadastroInformacaoDTO(
         String nome,
         String cpf,
         String rg,
         @JsonProperty(value = "data_nasc")
         String dataNascimento,
         String sexo,
         String mae,
         String pai,
         String email,
         String cep,
         String endereco,
         int numero,
         String bairro,
         String cidade,
         String estado,
         @JsonProperty(value = "telefone_fixo")
         String telefoneFixo,
         String celular,
         double altura,
         int peso,
         @JsonProperty(value = "tipo_sanguineo")
         String tipoSanguineo
){}
