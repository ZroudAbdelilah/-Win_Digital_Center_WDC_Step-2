import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { UtilisateursComponent } from './pages/utilisateurs/utilisateurs.component';
import { SettingsComponent } from './pages/settings/settings.component';
import { SideBarComponent } from './components/side-bar/side-bar.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { CardsComponent } from './components/cards/cards.component';
import { UsersTableComponent } from './components/users-table/users-table.component';
import { AddUserComponent } from './pages/add-user/add-user.component';
import { AddUsersComponent } from './components/add-users/add-users.component';
import { EditUserComponent } from './components/edit-user/edit-user.component';
import { EditUsersComponent } from './pages/edit-users/edit-users.component';
import { LoginImageComponent } from './components/login-image/login-image.component';
import { LoginFormComponent } from './components/login-form/login-form.component';
import { ExercicesComponent } from './pages/exercices/exercices/exercices.component';
import { AddExercicesComponent } from './pages/exercices/add-exercices/add-exercices.component';
import { EditExercicesComponent } from './pages/exercices/edit-exercices/edit-exercices.component';
import { TableExerciceComponent } from './components/exercices/table-exercice/table-exercice.component';
import { EditExerciceComponent } from './components/exercices/edit-exercice/edit-exercice.component';
import { AddExerciceComponent } from './components/exercices/add-exercice/add-exercice.component';
import { AddActivitiesComponent } from './pages/activities/add-activities/add-activities.component';
import { EditActivitiesComponent } from './pages/activities/edit-activities/edit-activities.component';
import { EditActivitieComponent } from './components/activities/edit-activitie/edit-activitie.component';
import { TableActivitiesComponent } from './components/activities/table-activities/table-activities.component';
import { AddActivitieComponent } from './components/activities/add-activitie/add-activitie.component';
import { ActivitiesComponent } from './pages/activities/activities/activities.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DashboardComponent,
    UtilisateursComponent,
    SettingsComponent,
    SideBarComponent,
    NavBarComponent,
    CardsComponent,
    UsersTableComponent,
    AddUserComponent,
    AddUsersComponent,
    EditUserComponent,
    EditUsersComponent,
    LoginImageComponent,
    LoginFormComponent,
    ExercicesComponent,
    TableExerciceComponent,
    EditExerciceComponent,
    EditExercicesComponent,
    AddExerciceComponent,
    AddExercicesComponent,
    AddActivitiesComponent,
    EditActivitiesComponent,
    EditActivitieComponent,
    TableActivitiesComponent,
    AddActivitieComponent,
    ActivitiesComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule, FormsModule, ReactiveFormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
