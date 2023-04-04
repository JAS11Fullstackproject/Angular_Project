import { Component, OnInit } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-nave-bar',
  templateUrl: './nave-bar.component.html',
  styleUrls: ['./nave-bar.component.css']
})
export class NaveBarComponent implements OnInit{

  constructor(public auth:AuthServiceService) { }
  result:boolean=true;

  ngOnInit(): void {
  }

  login(){
    this.result=false;
}

  logout(){
      //remove token
      this.auth.removeToken();
      this.auth.canAccess();
  }
}
