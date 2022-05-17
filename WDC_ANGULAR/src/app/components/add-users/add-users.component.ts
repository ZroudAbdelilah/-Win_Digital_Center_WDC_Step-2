import { Role } from 'src/app/model/role.model';
import { UsersService } from './../../shared/services/users.service';
import { Component, OnInit } from '@angular/core';
import { Users } from 'src/app/model/users.model';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-users',
  templateUrl: './add-users.component.html',
  styleUrls: ['./add-users.component.css'],
})
export class AddUsersComponent implements OnInit {
  user: Users = new Users();
  userform: FormGroup;
  roles: Role[] = [];

  constructor(
    private userService: UsersService,
    private router: Router,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    this.getRoles();

    this.userform = this.fb.group({
      firstName: [''],
      role: [''],
      lastName: [''],
      email: [''],
      password: [''],
      phoneNumber: [''],
      status: [''],
    });
  }

  getRoles(): void {
    this.userService.getRoles().subscribe((data: Role[]) => {
      this.roles = data;
    });
  }

  saveUser(): void {
    console.log(this.userform.value);

    this.userService
      .createUser(this.userform.value)
      .subscribe((data: Users) => {
        this.user = data;
        console.log(this.user);
        this.router.navigate(['/utilisateurs']);
      });
  }
}
