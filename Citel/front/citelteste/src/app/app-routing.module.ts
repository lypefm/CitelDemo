import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MainPageComponent } from './main-page/main-page.component';
import { QuantidadePessoaEstadoComponent } from './quantidade-pessoa-estado/quantidade-pessoa-estado.component';
import { FaixaEtariaIMCComponent } from './faixa-etaria-imc/faixa-etaria-imc.component';
import { PercentualPorSexoComponent } from './percentual-por-sexo/percentual-por-sexo.component';
import { IdadeMediaTipoSangueComponent } from './media-idade-tipo-sangue/media-idade-tipo-sangue.component';
import { DoadoresTipoDeSangueComponent } from './doadores-tipo-de-sangue/doadores-tipo-de-sangue.component';

const routes: Routes = [
  { path: '', redirectTo: '/main-page', pathMatch: 'full' }, // Redireciona para a página principal
  { path: 'main-page', component: MainPageComponent }, // Rota para o componente MainPage
  { path: 'quantidade-pessoa-estado', component: QuantidadePessoaEstadoComponent }, // Rota para o componente QuantidadePessoaEstado
  { path: 'faixa-etaria-imc', component: FaixaEtariaIMCComponent },
  { path: 'percentual-por-sexo', component: PercentualPorSexoComponent },
  { path: 'idade-media-tipo-sangue', component: IdadeMediaTipoSangueComponent },
  { path: 'possiveis-doadores-por-sangue', component: DoadoresTipoDeSangueComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
