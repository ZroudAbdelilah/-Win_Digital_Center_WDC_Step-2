import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TableExerciceComponent } from './table-exercice.component';

describe('TableExerciceComponent', () => {
  let component: TableExerciceComponent;
  let fixture: ComponentFixture<TableExerciceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TableExerciceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TableExerciceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
