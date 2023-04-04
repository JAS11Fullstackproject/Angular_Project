
import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-registerandlogin',
  templateUrl: './registerandlogin.component.html',
  styleUrls: ['./registerandlogin.component.css']
})
export class RegisterandloginComponent implements OnInit{

  formdata = {username:"",email:"",password:"",c_password:"", lemail:"", lpassword:""};
  
  submit=false;
  errorMessage="";
  errorMessages="";
  loading=false;
  flag=false;
  result:boolean=true;

  constructor(private auth:AuthServiceService, private route:Router) { }
  
  ngOnInit(): void {
    this.auth.canAuthenticate();  
  }

  onRegistration(){
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
               //this.formdata.email=('');
               //this.formdata.password=('');
               this.result=false;
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

  onLogin(){
    this.loading=true;
    //call login service
    this.auth.login(this.formdata.lemail,this.formdata.lpassword)
    .subscribe({
        next:data=>{
            //store token
            this.auth.storeToken(data.accessToken);
            console.log('logged user token is '+data.accessToken);
            this.auth.canAuthenticate();
            this.route.navigate(['/tab']);
        },
        error:data=>{
            if(data.message){
            this.errorMessages="Wrong Email or Password";
            }
        }
    }).add(()=>{
        this.loading =false;
    })
  }

  login(){
      this.result=false;
  }

  register(){
    this.result=true;
}

}
