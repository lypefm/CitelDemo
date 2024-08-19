import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PercentualPorSexoComponent } from './percentual-por-sexo.component';

describe('PercentualPorSexoComponent', () => {
  let component: PercentualPorSexoComponent;
  let fixture: ComponentFixture<PercentualPorSexoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PercentualPorSexoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PercentualPorSexoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
