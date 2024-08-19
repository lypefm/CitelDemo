import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class PessoaService {

  
  private apiUrlContagemEstado = 'http://localhost:8080/api/recuperar/contagemPessoaEstado';
  private apiUrlPercentualPorSexo = 'http://localhost:8080/api/recuperar/percentualObesos';
  private apiUrlIdadeMediaTipoSanguineo = 'http://localhost:8080/api/recuperar/mediaIdadeTipoSangue';
  private apiUrlDoadoresPorTipoSangue = 'http://localhost:8080/api/recuperar/doadorPorTipoSanguineo';
  

  constructor(private http: HttpClient) { }

  getContagemPessoaEstado(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrlContagemEstado);
  }

  getPercentualPorSexo(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrlPercentualPorSexo);
  }

  getIdadeMediaTipoSanguineo(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrlIdadeMediaTipoSanguineo);
  }

  getDoadoresPorTipoSangue(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrlDoadoresPorTipoSangue);
  }
}
