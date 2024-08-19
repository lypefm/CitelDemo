import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ImcService {

  
  private apiUrl = 'http://localhost:8080/api/recuperar/imcMedio';

  constructor(private http: HttpClient) { }

  getImcMedioFaixaEtaria(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }
}
