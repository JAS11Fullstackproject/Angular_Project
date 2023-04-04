import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { NaveBarComponent } from './nave-bar/nave-bar.component';
import { HttpClientModule} from '@angular/common/http';
import { RegisterComponent } from './register/register.component'
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { TabsComponent } from './tabs/tabs.component';
import {MatTabsModule} from '@angular/material/tabs';
import { PersonalDetailsComponent } from './personal-details/personal-details.component';
import { TabsModule } from 'ngx-bootstrap/tabs';
import { BsDatepickerModule } from 'ngx-bootstrap/datepicker';
import { LanguageComponent } from './language/language.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { RegisterandloginComponent } from './registerandlogin/registerandlogin.component';
import { FormregandlogComponent } from './formregandlog/formregandlog.component'

const routes:Routes = [
  {path:'',component:HomeComponent },
  // {path:'register',component:RegisterComponent},
  // {path:'login',component:LoginComponent},
   {path:'tab',component:TabsComponent},
  {path:'registerandlogin' ,component:RegisterandloginComponent}
  //{path:'login' ,component:FormregandlogComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NaveBarComponent,
    RegisterComponent,
    LoginComponent,
    HomeComponent,
    TabsComponent,
    PersonalDetailsComponent,
    LanguageComponent,
    RegisterandloginComponent,
    FormregandlogComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    TabsModule.forRoot(),
    BsDatepickerModule.forRoot(),
    FormsModule,
    HttpClientModule,
    MatTabsModule,
    ReactiveFormsModule,
    FontAwesomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
