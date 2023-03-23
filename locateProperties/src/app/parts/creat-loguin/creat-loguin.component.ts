import { Component } from '@angular/core';

@Component({
  selector: 'app-creat-loguin',
  templateUrl: './creat-loguin.component.html',
  styleUrls: ['./creat-loguin.component.css']
})
export class CreatLoguinComponent { 
  url = window.location.href.split("/")[3] ;
  title = this.url !== "login" ? "Logar" : "Criar conta";
}
