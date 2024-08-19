import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'; 
import { QuantidadePessoaEstadoComponent } from './quantidade-pessoa-estado/quantidade-pessoa-estado.component';
import { MainPageComponent } from './main-page/main-page.component';
import { RouterOutlet } from '@angular/router';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module'; 
import { FaixaEtariaIMCComponent } from './faixa-etaria-imc/faixa-etaria-imc.component';
import { PercentualPorSexoComponent } from './percentual-por-sexo/percentual-por-sexo.component';
import { IdadeMediaTipoSangueComponent } from './media-idade-tipo-sangue/media-idade-tipo-sangue.component';
import { DoadoresTipoDeSangueComponent } from './doadores-tipo-de-sangue/doadores-tipo-de-sangue.component';

@NgModule({
  declarations: [
    AppComponent,
    MainPageComponent,
    QuantidadePessoaEstadoComponent,
    FaixaEtariaIMCComponent,
    PercentualPorSexoComponent,
    IdadeMediaTipoSangueComponent,
    DoadoresTipoDeSangueComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterOutlet,
    AppRoutingModule
  ],
  providers: [], // Adicione serviços aqui, se necessário
  bootstrap: [AppComponent] // Componente raiz que inicia a aplicação
})
export class AppModule { }
