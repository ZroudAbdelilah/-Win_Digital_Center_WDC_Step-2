import { retry, catchError } from 'rxjs/operators';
import { Users } from './../../model/users.model';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment.prod';
import { Observable } from 'rxjs/internal/Observable';
import { throwError } from 'rxjs/internal/observable/throwError';
import { Role } from 'src/app/model/role.model';

@Injectable({
  providedIn: 'root',
})
export class UsersService {
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };

  constructor(private http: HttpClient) {}

  getUsers(): Observable<Users[]> {
    return this.http
      .get<Users[]>(environment.baseUrl + '/users')
      .pipe(retry(1), catchError(this.handleError));
  }

  getUserById(id: number): Observable<Users> {
    return this.http
      .get<Users>(environment.baseUrl + '/users/find/' + id)
      .pipe(retry(1), catchError(this.handleError));
  }

  getRoles(): Observable<Role[]> {
    return this.http
      .get<Role[]>(environment.baseUrl + '/roles')
      .pipe(retry(1), catchError(this.handleError));
  }



  updateUser(user : Users) : Observable<Users> {
    return this.http.put<Users>(environment.baseUrl + '/users/update',user).pipe(retry(1) ,catchError(this.handleError));
  }


 




  createUser(user: Users): Observable<Users> {
    return this.http
      .post<Users>(
        environment.baseUrl + '/users/add',
        JSON.stringify(user),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
  }

  deleteUser(id: number): Observable<any> {
    return this.http.delete(environment.baseUrl + '/users/delete/' + id);
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
