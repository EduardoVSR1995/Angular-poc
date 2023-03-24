import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['../loginCreat.component.css']
})
export class LoginComponent{ 
  form: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
  ) { 
    this.form = this.formBuilder.group({

    })
  }

  onSubmit(){
    console.log(this.form.value, "jijiji");
  }
}
