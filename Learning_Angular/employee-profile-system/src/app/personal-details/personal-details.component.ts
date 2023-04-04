import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { PersonalService } from '../services/personal.service';
import { faCalendar, faEnvelope, faMobile, faUser,  } from '@fortawesome/free-solid-svg-icons';
import * as moment from 'moment/moment';

@Component({
  selector: 'app-personal-details',
  templateUrl: './personal-details.component.html',
  styleUrls: ['./personal-details.component.css']
})
export class PersonalDetailsComponent{
  userIcon = faUser;
  emailIcon = faEnvelope;
  mobileIcon = faMobile;
  dateIcon= faCalendar;
  showAge: any;

  @Output() succFlag: EventEmitter<boolean> = new EventEmitter<boolean>();
  personal = {first_name:"",middle_name:"",last_name:"",date_of_birth:"",age:"",gender:"",email:"",mobile_no:"",
  address:"",city:"",state:"",country:"",pin_code:"",alternate_no:"",emergency_no:"",blood_group:"",passport_no:"",passport_copy:"",aadhar_no:"",
  aadhar_copy:"",driving_license:"",driving_license_copy:"",previous_emp_id:"",previous_employer_details:"",work_location:"",marital_status:"",
  language_known:"",github_id:"",social_media:"",physically_challenge:"",identification_marks:"",passportname:"",aadharname:"",drivinglicencename:""};
  loading=false;
  submit=false;
  errorMessage="";
  
  

  ageCalculator(){
    if(this.personal.age){
      const convertAge = new Date(this.personal.age);
      const timeDiff = Math.abs(Date.now() - convertAge.getTime());
      this.showAge = Math.floor((timeDiff / (1000 * 3600 * 24))/365);
    }
  }

  savedata() {
    console.log("sucess");
    this.succFlag.emit(true);
  }
  
  constructor(private auth:PersonalService, private route:Router) {
  }

  onSubmit(form:NgForm):void{
    console.log(form.value);
    this.loading=true;
    this.auth
      .save(this.personal.first_name,this.personal.middle_name,this.personal.last_name,this.personal.date_of_birth,this.personal.age,this.personal.gender,this.personal.email,this.personal.mobile_no,
       this.personal.address,this.personal.city,this.personal.state,this.personal.country,this.personal.pin_code,this.personal.alternate_no,this.personal.emergency_no,this.personal.blood_group,this.personal.passport_no,this.personal.passport_copy,this.personal.aadhar_no,
       this.personal.aadhar_copy,this.personal.driving_license,this.personal.driving_license_copy,this.personal.previous_emp_id,this.personal.previous_employer_details,this.personal.work_location,this.personal.marital_status,
       this.personal.language_known,this.personal.github_id,this.personal.social_media,this.personal.physically_challenge,this.personal.identification_marks,this.personal.passportname,this.personal.aadharname,this.personal.drivinglicencename)

       .subscribe({
        next:data=>{
          console.log("aa",data)
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


