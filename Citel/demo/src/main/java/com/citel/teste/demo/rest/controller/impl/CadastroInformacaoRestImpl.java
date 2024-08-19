package com.citel.teste.demo.rest.controller.impl;

import com.citel.teste.demo.demografico.enums.ESexo;
import com.citel.teste.demo.demografico.enums.ETipoDocumento;
import com.citel.teste.demo.demografico.enums.ETipoContato;
import com.citel.teste.demo.entities.AntropometriaPessoa;
import com.citel.teste.demo.entities.ContatoPessoa;
import com.citel.teste.demo.entities.DocumentoPessoa;
import com.citel.teste.demo.entities.EnderecoPessoa;
import com.citel.teste.demo.entities.Pessoa;
import com.citel.teste.demo.model.CadastroInformacaoDTO;
import com.citel.teste.demo.rest.controller.interfaces.CadastroInformacaoRest;
import com.citel.teste.demo.demografico.enums.ETipoSangue;
import com.citel.teste.demo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/cadastro")
public class CadastroInformacaoRestImpl implements CadastroInformacaoRest {

    @Autowired
    private PessoaService pessoaService;

    @Override
    @PostMapping("/informacao")
    public ResponseEntity salvarCadastros(@RequestBody List<CadastroInformacaoDTO> informacaoDTO) {


        informacaoDTO.forEach(dto ->{
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(dto.nome());
            pessoa.setSexo(ESexo.valueOf(dto.sexo()));
            pessoa.setDataDeNascimento(LocalDate.parse(dto.dataNascimento(),  DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            pessoa.setNomeMae(dto.mae());
            pessoa.setNomePai(dto.pai());
            pessoa.setTipoSangue(ETipoSangue.fromDescricao(dto.tipoSanguineo()));

            if(Objects.nonNull(dto.cpf())) {
                DocumentoPessoa documentoPessoa = new DocumentoPessoa();
                documentoPessoa.setTipoDocumento(ETipoDocumento.CPF);
                documentoPessoa.setValor(dto.cpf());
                documentoPessoa.setPessoa(pessoa);
                pessoa.getDocumentos().add(documentoPessoa);
            }

            if(Objects.nonNull(dto.rg())) {
                DocumentoPessoa documentoPessoa = new DocumentoPessoa();
                documentoPessoa.setTipoDocumento(ETipoDocumento.RG);
                documentoPessoa.setValor(dto.rg());
                documentoPessoa.setPessoa(pessoa);
                pessoa.getDocumentos().add(documentoPessoa);
            }

            if(Objects.nonNull(dto.endereco())){
                EnderecoPessoa enderecoPessoa = new EnderecoPessoa();
                enderecoPessoa.setEndereco(dto.endereco());
                enderecoPessoa.setCep(dto.cep());
                enderecoPessoa.setCidade(dto.cidade());
                enderecoPessoa.setBairro(dto.bairro());
                enderecoPessoa.setNumero(dto.numero());
                enderecoPessoa.setPessoa(pessoa);
                enderecoPessoa.setEstado(dto.estado());
                pessoa.getEnderecos().add(enderecoPessoa);
            }

            if(Objects.nonNull(dto.telefoneFixo())){
                ContatoPessoa contatoTelefone = new ContatoPessoa();
                contatoTelefone.setValor(dto.telefoneFixo());
                contatoTelefone.setTipoContato(ETipoContato.TELEFONE);
                contatoTelefone.setPessoa(pessoa);
                pessoa.getContatos().add(contatoTelefone);
            }

            if(Objects.nonNull(dto.email())){
                ContatoPessoa contatoEmail = new ContatoPessoa();
                contatoEmail.setValor(dto.email());
                contatoEmail.setTipoContato(ETipoContato.EMAIL);
                contatoEmail.setPessoa(pessoa);
                pessoa.getContatos().add(contatoEmail);
            }

            if(Objects.nonNull(dto.celular())){
                ContatoPessoa contatoCelular = new ContatoPessoa();
                contatoCelular.setValor(dto.celular());
                contatoCelular.setTipoContato(ETipoContato.CELULAR);
                contatoCelular.setPessoa(pessoa);
                pessoa.getContatos().add(contatoCelular);
            }

            if(Objects.nonNull(dto.peso())){
                AntropometriaPessoa antropometriaPessoa = new AntropometriaPessoa();
                antropometriaPessoa.setPeso(dto.peso());
                antropometriaPessoa.setAltura(dto.altura());
                antropometriaPessoa.setPessoa(pessoa);
                pessoa.getAntropometrias().add(antropometriaPessoa);
            }
            pessoaService.salvarPessoa(pessoa);
        });
        return ResponseEntity.ok().build();
    }
}
