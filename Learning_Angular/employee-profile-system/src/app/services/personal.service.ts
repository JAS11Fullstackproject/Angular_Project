import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class PersonalService {

  loading=false;
  constructor(private router:Router,private http:HttpClient) { }


  load():boolean{
    return this.loading=true;
  }

  canload(){
    if (this.load()) {
      //redirect to dashboard
      this.router.navigate(['/tabs']);
      // this.router.navigate(['/dashboard']);
    }
  }

 save(first_name:string,middle_name:string,last_name:string,
  date_of_birth:string,age:string,gender:string,
  email:string,mobile_no:string,address:string,
  city:string,state:string,country:string,
  pin_code:string,alternate_no:string,emergency_no:string,
  blood_group:string,passport_no:string,passport_copy:string,
  aadhar_no:string,aadhar_copy:string,driving_license:string,
  driving_license_copy:string,previous_emp_id:string,previous_employer_details:string,
  work_location:string,marital_status:string,language_known:string,
  github_id:string,social_media:string,physically_challenge:string,
  identification_marks:string,passportname:string,aadharname:string,
  drivinglicencename:string){
  //send data to register api
 return this.http
  .post<{accessToken:string}>(
    'http://localhost:8080/api/auth/personal',
      {displayName:first_name,middle_name,last_name,date_of_birth,age,gender,email,mobile_no,
        address,city,state,country,pin_code,alternate_no,emergency_no,blood_group,passport_no,passport_copy,aadhar_no,
        aadhar_copy,driving_license,driving_license_copy,previous_emp_id,previous_employer_details,work_location,marital_status,
        language_known,github_id,social_media,physically_challenge,identification_marks,passportname,aadharname,drivinglicencename}
  );
}
}