import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-initial-page',
  templateUrl: './initial-page.component.html',
  styleUrls: ['./initial-page.component.css']
})

export class InitialPageComponent{
  itens: Array<any> = [];
  imagesUrl: Array<{url: string}> = [];

  constructor( 
    private http: HttpClient 
    ){ }

  ngOnInit(){
    this.http.get('/api/house')
      .subscribe(i => {
        this.itens = i as any[];
      });
  };
  getImage (id: number ){
    console.log(id);
    this.http.post<{url: string}[]> ('/api/house', { id })
      .subscribe(i => this.imagesUrl=i );
    }
}