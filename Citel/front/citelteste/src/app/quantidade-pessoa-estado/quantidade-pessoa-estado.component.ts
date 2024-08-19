import { Component, OnInit } from '@angular/core';
import { PessoaService } from '../services/pessoa.service';
import { Location } from '@angular/common';

@Component({
  selector: 'app-quantidade-pessoa-estado',
  templateUrl: './quantidade-pessoa-estado.component.html',
  styleUrl: './quantidade-pessoa-estado.component.css'
})
export class QuantidadePessoaEstadoComponent implements OnInit {

  dadosEstados: [string, number][] = [];

  constructor(private pessoaService: PessoaService, private location: Location) { }

  ngOnInit(): void {
    this.pessoaService.getContagemPessoaEstado().subscribe(data => {
      this.dadosEstados = data;
    });
  } 

  goBack(): void {
    this.location.back();
  }

}
