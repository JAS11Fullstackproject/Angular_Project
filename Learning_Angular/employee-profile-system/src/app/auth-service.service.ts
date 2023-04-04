import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  constructor(private router:Router,private http:HttpClient) { }


  isAuthenticated():boolean{
    if (sessionStorage.getItem('token')!==null) {
        return true;
    }
    return false;
  }

  canAccess(){
    if (!this.isAuthenticated()) {
//redirect to login
this.router.navigate(['/registerandlogin']);
    }
  }
  canAuthenticate(){
    if (this.isAuthenticated()) {
      //redirect to dashboard
      this.router.navigate(['/login']);
      // this.router.navigate(['/dashboard']);
    }
  }

  register(username:string,email:string,password:string,){
      //send data to register api
     return this.http
      .post<{accessToken:string}>(
        'http://localhost:8080/api/auth',
          {displayName:username,email,password}
      );
  }

  registers(username:string,email:string,password:string,confirmPassword:string){
    //send data to register api
   return this.http
    .post<{accessToken:string}>(
      'http://localhost:8080/api/auth',
        {displayName:username,email,password,confirmPassword}
    );
}

  storeToken(token:string){
      sessionStorage.setItem('token',token);
  }

  login(email:string,password:string){
    //send data to login api (firebase)
      return this.http
      .post<{accessToken:string}>(
          'http://localhost:8080/api/auth/signin',
            {email,password}
      );
  }

  detail(){
    let token = sessionStorage.getItem('token');

    return this.http.post<{users:Array<{localId:string,displayName:string}>}>(
        'https://identitytoolkit.googleapis.com/v1/accounts:lookup?key=[API_KEY]',
        {accessToken:token}
    );
  }

  removeToken(){
    sessionStorage.removeItem('token');
  }

}
