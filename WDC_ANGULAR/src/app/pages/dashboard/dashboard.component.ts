import { Admin } from './../../model/admin.model';
import { ApiService } from './../../shared/rest-api.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css'],
})
export class DashboardComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {
  }

  }

  /*
  subscribe(
    data => {
      this.tutorials = data;
      console.log(data);
    },
    error => {
      console.log(error);
    });

    */

