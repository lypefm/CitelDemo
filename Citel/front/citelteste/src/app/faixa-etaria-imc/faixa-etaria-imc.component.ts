import { Component, OnInit } from '@angular/core';
import { PessoaService } from '../services/pessoa.service';
import { Location } from '@angular/common';
import { ImcService } from '../services/imc.service';

@Component({
  selector: 'app-faixa-etaria-imc',
  templateUrl: './faixa-etaria-imc.component.html',
  styleUrl: './faixa-etaria-imc.component.css'
})
export class FaixaEtariaIMCComponent implements OnInit{

  dadosFaixaEtaria: [string, number][] = [];

  constructor(private imcService: ImcService, private location: Location) { }

  ngOnInit(): void {
    this.imcService.getImcMedioFaixaEtaria().subscribe(data => {
      this.dadosFaixaEtaria = data;
    });
  } 

  goBack(): void {
    this.location.back();
  }
}
