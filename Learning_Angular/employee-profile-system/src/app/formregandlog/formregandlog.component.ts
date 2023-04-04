import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import Validation from './validation';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-formregandlog',
  templateUrl: './formregandlog.component.html',
  styleUrls: ['./formregandlog.component.css']
})
export class FormregandlogComponent implements OnInit{
  form: FormGroup = new FormGroup({
    username: new FormControl(''),
    email: new FormControl(''),
    password: new FormControl(''),
    confirmPassword: new FormControl(''),
    acceptTerms: new FormControl(false),
    lemail: new FormControl(''),
    lpassword: new FormControl('')
  });
  submitted = false;
  result:boolean=true;
  loading=false;
  errorMessage='';
  errorMessages='';

  constructor(private formBuilder: FormBuilder, private auth:AuthServiceService) {}

  ngOnInit(): void {
    this.form = this.formBuilder.group(
      {
        username: [
          '',
          [
            Validators.required,
            Validators.minLength(6),
            Validators.maxLength(20)
          ]
        ],
        email: ['', [Validators.required, Validators.email]],
        password: [
          '',
          [
            Validators.required,
            Validators.minLength(8),
            Validators.maxLength(40)
          ]
        ],
        confirmPassword: ['', Validators.required],
        acceptTerms: [false, Validators.requiredTrue],
        lemail: ['', [Validators.required, Validators.email]],
        lpassword: [
          '',
          [
            Validators.required,
            Validators.minLength(8),
            Validators.maxLength(40)
          ]
        ]
      },
      {
        validators: [Validation.match('password', 'confirmPassword')]
      }
    );
  }
  get f(): { [key: string]: AbstractControl } {
    return this.form.controls;
  }

  onSubmit(){
    this.loading=true;
    console.log("ff",this.form)
      //call register service
      console.log("xx",this.form.value.username,this.form.value.email,this.form.value.password,this.form.value.confirmPassword)
      this.auth
      .registers(this.form.value.username,this.form.value.email,this.form.value.password,this.form.value.confirmPassword)
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
          return;
      })


    if (this.form.invalid) {
      return;
    }

    console.log(JSON.stringify(this.form.value, null, 2));
  }

  onReset(): void {
    this.submitted = false;
    this.form.reset();
  }

  login(){
    this.result=false;
}

register(){
  this.result=true;
}
}


