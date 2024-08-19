import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IdadeMediaTipoSangueComponent } from './media-idade-tipo-sangue.component';

describe('MediaIdadeTipoSangueComponent', () => {
  let component: IdadeMediaTipoSangueComponent;
  let fixture: ComponentFixture<IdadeMediaTipoSangueComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [IdadeMediaTipoSangueComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(IdadeMediaTipoSangueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
