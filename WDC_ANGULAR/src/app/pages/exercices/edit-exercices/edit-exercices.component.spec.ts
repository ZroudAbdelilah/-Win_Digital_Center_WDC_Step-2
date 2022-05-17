import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditExercicesComponent } from './edit-exercices.component';

describe('EditExercicesComponent', () => {
  let component: EditExercicesComponent;
  let fixture: ComponentFixture<EditExercicesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditExercicesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditExercicesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
