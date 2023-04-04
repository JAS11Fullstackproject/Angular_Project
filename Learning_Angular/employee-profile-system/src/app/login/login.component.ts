import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{

  formdata = {email:"",password:""};
  submit=false;
  loading=false;
  errorMessage="";
  
  constructor(private auth:AuthServiceService,private route:Router) { }

  ngOnInit(): void {
    this.auth.canAuthenticate();
  }

  onSubmit(){
    this.loading=true;
    //call login service
    this.auth.login(this.formdata.email,this.formdata.password)
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
            this.errorMessage="Wrong Email or Password";
            }
        }
    }).add(()=>{
        this.loading =false;
    })
  }
}
