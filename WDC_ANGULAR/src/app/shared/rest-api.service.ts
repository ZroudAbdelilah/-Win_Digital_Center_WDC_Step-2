import { environment } from './../../environments/environment.prod';

import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { Admin } from '../model/admin.model';
@Injectable({
  providedIn: 'root',
})
export class ApiService {
  // Define API
  apiURL: string = environment.baseUrl;
 
  constructor(private http: HttpClient) {}

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };
  // HttpClient API get() method => Fetch Admins list
  getAdmins(): Observable<Admin[]> {
    return this.http
      .get<Admin[]>(this.apiURL + '/admins')
      .pipe(retry(1), catchError(this.handleError));
  }
  // HttpClient API get() method => Fetch Admin
  getAdmin(id: any): Observable<Admin> {
    return this.http
      .get<Admin>(this.apiURL + '/Admins/' + id)
      .pipe(retry(1), catchError(this.handleError));
  }
  // HttpClient API post() method => Create Admin
  createAdmin(Admin: any): Observable<Admin> {
    return this.http
      .post<Admin>(
        this.apiURL + '/Admins',
        JSON.stringify(Admin),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
  }
  // HttpClient API put() method => Update Admin
  updateAdmin(id: any, Admin: any): Observable<Admin> {
    return this.http
      .put<Admin>(
        this.apiURL + '/Admins/' + id,
        JSON.stringify(Admin),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
  }
  // HttpClient API delete() method => Delete Admin
  deleteAdmin(id: any) {
    return this.http
      .delete<Admin>(this.apiURL + '/Admins/' + id, this.httpOptions)
      .pipe(retry(1), catchError(this.handleError));
  }
  // Error handling
  handleError(error: any) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = error.error.message;
    } else {
      // Get server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    window.alert(errorMessage);
    return throwError(() => {
      return errorMessage;
    });
  }
}
