import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegisterandloginComponent } from './registerandlogin.component';

describe('RegisterandloginComponent', () => {
  let component: RegisterandloginComponent;
  let fixture: ComponentFixture<RegisterandloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegisterandloginComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegisterandloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
