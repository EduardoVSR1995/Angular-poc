import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-creat',
  templateUrl: './creat.component.html',
  styleUrls: ['../loginCreat.component.css']
})

export class CreatComponent {
  form: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
  ) { 
     
    this.form = this.formBuilder.group({
      email: [null, Validators.required],
      password: [null, Validators.required],
      cep: [null, Validators.required]
    })
  }

  onSubmit(){
      console.log(this.form.value);
  } 
}
