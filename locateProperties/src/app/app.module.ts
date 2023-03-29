import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { CreatComponent } from './pages/creat/creat.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { InitialPageComponent } from './pages/initial-page/initial-page.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      { path: '', component: InitialPageComponent},
      { path: 'login', component: LoginComponent},
      { path: 'create', component: CreatComponent }
    ]),
    HttpClientModule,
  ],  
  declarations: [
    AppComponent,
    LoginComponent,
    CreatComponent,
    InitialPageComponent,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }