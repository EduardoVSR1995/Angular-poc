import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-initial-page',
  templateUrl: './initial-page.component.html',
  styleUrls: ['./initial-page.component.css']
})

export class InitialPageComponent{
  itens: Array<any> = [];

  constructor( 
    private http: HttpClient 
    ){ }

  ngOnInit(){
    this.http.get('/api/house')
      .subscribe(i => {
        this.itens = i as any[];
      });
  };
  
}