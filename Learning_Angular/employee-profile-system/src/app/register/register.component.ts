import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit{

  formdata = {username:"",email:"",password:"",c_password:""};
  submit=false;
  errorMessage="";
  loading=false;

  constructor(private auth:AuthServiceService, private route:Router) { }

  ngOnInit(): void {
    this.auth.canAuthenticate();  
  }

  onSubmit(){
      this.loading=true;
      //call register service
      console.log("lala",this.formdata.username,this.formdata.email,this.formdata.password,this.formdata.c_password)
      this.auth
      .register(this.formdata.username,this.formdata.email,this.formdata.password)
      .subscribe({
          next:data=>{
            console.log("aa",data)
              //store token from response data
               this.auth.storeToken(data.accessToken);
              // console.log('Registered idtoken is '+data.accessToken);
              this.auth.canAuthenticate();
          },
          error:data=>{
            console.log("nn",data)
            if(data.message){
            this.errorMessage=data.error.message;
            }
              this.loading=false;
              return;
          }
      }).add(()=>{
          this.loading =false;
      })
  }
}
