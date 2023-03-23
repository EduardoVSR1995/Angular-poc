import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatLoguinComponent } from './creat-loguin.component';

describe('CreatLoguinComponent', () => {
  let component: CreatLoguinComponent;
  let fixture: ComponentFixture<CreatLoguinComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreatLoguinComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreatLoguinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
