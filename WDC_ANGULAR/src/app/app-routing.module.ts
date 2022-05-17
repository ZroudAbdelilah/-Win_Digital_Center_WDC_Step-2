import { EditActivitiesComponent } from './pages/activities/edit-activities/edit-activities.component';
import { AddActivitiesComponent } from './pages/activities/add-activities/add-activities.component';
import { ActivitiesComponent } from './pages/activities/activities/activities.component';
import { AddExercicesComponent } from './pages/exercices/add-exercices/add-exercices.component';
import { ExercicesComponent } from './pages/exercices/exercices/exercices.component';
import { LoginComponent } from './pages/login/login.component';
import { EditUsersComponent } from './pages/edit-users/edit-users.component';
import { UtilisateursComponent } from './pages/utilisateurs/utilisateurs.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddUserComponent } from './pages/add-user/add-user.component';
import { EditExercicesComponent } from './pages/exercices/edit-exercices/edit-exercices.component';

const routes: Routes = [
  {
    path: '',
    component: DashboardComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'utilisateurs',
    children: [
      {
        path: '',
        component: UtilisateursComponent
      },
      {
        path: 'add',
        component: AddUserComponent
      },
      {
        path: 'edit/:id',
        component: EditUsersComponent
      },
    ]
  },
  {
    path: 'exercices',
    children: [
      {
        path: '',
        component: ExercicesComponent
     },
      {
        path: 'add',
        component: AddExercicesComponent
      },
      {
        path: 'edit',
        component: EditExercicesComponent
      },
    ]
  },
  {
    path: 'activites',
    children: [
      {
        path: '',
        component: ActivitiesComponent
     },
      {
        path: 'add',
        component: AddActivitiesComponent
      },
      {
        path: 'edit',
        component: EditActivitiesComponent
      },
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
