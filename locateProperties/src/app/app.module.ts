import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { CreatComponent } from './pages/creat/creat.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      { path: '', component: LoginComponent},
      { path: 'create', component: CreatComponent }
    ])
  ],  
  declarations: [
    AppComponent,
    LoginComponent,
    CreatComponent,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
