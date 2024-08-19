import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FaixaEtariaIMCComponent } from './faixa-etaria-imc.component';

describe('FaixaEtariaIMCComponent', () => {
  let component: FaixaEtariaIMCComponent;
  let fixture: ComponentFixture<FaixaEtariaIMCComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FaixaEtariaIMCComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FaixaEtariaIMCComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
