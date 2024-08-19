import { Component, OnInit } from '@angular/core';
import { PessoaService } from '../services/pessoa.service';
import { Location } from '@angular/common';

@Component({
  selector: 'app-media-idade-tipo-sangue',
  templateUrl: './media-idade-tipo-sangue.component.html',
  styleUrl: './media-idade-tipo-sangue.component.css'
})
export class IdadeMediaTipoSangueComponent implements OnInit {

  dadosMedioTipoSanguineo: [string, number][] = [];

  constructor(private pessoaService: PessoaService, private location: Location) { }

  ngOnInit(): void {
    this.pessoaService.getIdadeMediaTipoSanguineo().subscribe(data => {
      this.dadosMedioTipoSanguineo = data;
    });
  } 

  goBack(): void {
    this.location.back();
  }
}