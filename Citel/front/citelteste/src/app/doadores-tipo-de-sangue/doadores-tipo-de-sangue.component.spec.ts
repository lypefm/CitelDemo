import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoadoresTipoDeSangueComponent } from './doadores-tipo-de-sangue.component';

describe('DoadoresTipoDeSangueComponent', () => {
  let component: DoadoresTipoDeSangueComponent;
  let fixture: ComponentFixture<DoadoresTipoDeSangueComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DoadoresTipoDeSangueComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DoadoresTipoDeSangueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
