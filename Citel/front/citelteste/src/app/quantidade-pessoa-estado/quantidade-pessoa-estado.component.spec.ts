import { ComponentFixture, TestBed } from '@angular/core/testing';

import { QuantidadePessoaEstadoComponent } from './quantidade-pessoa-estado.component';

describe('QuantidadePessoaEstadoComponent', () => {
  let component: QuantidadePessoaEstadoComponent;
  let fixture: ComponentFixture<QuantidadePessoaEstadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [QuantidadePessoaEstadoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(QuantidadePessoaEstadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
