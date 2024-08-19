import { Component, OnInit } from '@angular/core';
import { PessoaService } from '../services/pessoa.service';
import { Location } from '@angular/common';

@Component({
  selector: 'app-doadores-tipo-de-sangue',
  templateUrl: './doadores-tipo-de-sangue.component.html',
  styleUrl: './doadores-tipo-de-sangue.component.css'
})
export class DoadoresTipoDeSangueComponent implements OnInit {

  dadosDoadores: [string, number][] = [];

  constructor(private pessoaService: PessoaService, private location: Location) { }

  ngOnInit(): void {
    this.pessoaService.getDoadoresPorTipoSangue().subscribe(data => {
      this.dadosDoadores = data;
    });
  } 

  goBack(): void {
    this.location.back();
  }

}