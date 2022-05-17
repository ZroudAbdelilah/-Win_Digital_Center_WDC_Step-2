import { Router } from '@angular/router';
import { UsersService } from './../../shared/services/users.service';
import { Users } from './../../model/users.model';

import { ApiService } from './../../shared/rest-api.service';
import { Admin } from './../../model/admin.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-users-table',
  templateUrl: './users-table.component.html',
  styleUrls: ['./users-table.component.css'],
})
export class UsersTableComponent implements OnInit {
  Users: Users[] = [];
  constructor(private userService: UsersService, private router: Router) {}

  ngOnInit(): void {
    this.retriveUsers();
  }

  retriveUsers(): void {
    this.userService.getUsers().subscribe((data: Users[]) => {
      this.Users = data;
      console.log(this.Users);
    });
  }

  deleteUser(idUser: number): void {
    this.userService.deleteUser(idUser).subscribe(() => {
      console.log('deleted successfully');
      this.router.navigate(['/utilisateurs']);
    });

    this.router.navigateByUrl('/');
  }
}
