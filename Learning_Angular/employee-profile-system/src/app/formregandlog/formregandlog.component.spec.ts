import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormregandlogComponent } from './formregandlog.component';

describe('FormregandlogComponent', () => {
  let component: FormregandlogComponent;
  let fixture: ComponentFixture<FormregandlogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormregandlogComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormregandlogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
