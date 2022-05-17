import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddExercicesComponent } from './add-exercices.component';

describe('AddExercicesComponent', () => {
  let component: AddExercicesComponent;
  let fixture: ComponentFixture<AddExercicesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddExercicesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddExercicesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
