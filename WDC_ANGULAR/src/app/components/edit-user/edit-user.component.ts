import { Role } from './../../model/role.model';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Users } from 'src/app/model/users.model';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { UsersService } from './../../shared/services/users.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css'],
})
export class EditUserComponent implements OnInit {
  constructor(
    private userService: UsersService,
    private router: Router,
    private route: ActivatedRoute,
    private fb: FormBuilder
  ) {}

  userform: FormGroup;
  roles: Role[] = [];

  idUser = this.route.snapshot.params['id'];

  user: Users;

  ngOnInit(): void {
    this.getRoles();
    this.getUserById();

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

  getUserById(): void {
    this.userService.getUserById(this.idUser).subscribe((x: any) => {
      this.user = x;
      this.userform.patchValue(x);

      this.userform.get('role')?.patchValue(this.user.role?.roleId);
      this.userform.get('status')?.patchValue(this.user.status);
    });
  }

  updateUser(): void {
    this.userform.get('role')?.patchValue(this.user.role);
    this.userService
      .updateUser(this.userform.value)
      .subscribe((data: Users) => {
        this.userform.get('role')?.patchValue(this.user.role?.roleId);
       
        this.router.navigate(['/utilisateurs']);
      });
  }
}
