import { Component, OnInit } from '@angular/core';
import { PessoaService } from '../services/pessoa.service';
import { Location } from '@angular/common';

@Component({
  selector: 'app-percentual-por-sexo',
  templateUrl: './percentual-por-sexo.component.html',
  styleUrl: './percentual-por-sexo.component.css'
})
export class PercentualPorSexoComponent implements OnInit {

  dadosPercentuais: [string, number][] = [];

  constructor(private pessoaService: PessoaService, private location: Location) { }

  ngOnInit(): void {
    this.pessoaService.getPercentualPorSexo().subscribe(data => {
      this.dadosPercentuais = data;
    });
  } 

  goBack(): void {
    this.location.back();
  }
}
