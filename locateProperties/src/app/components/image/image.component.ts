import { HttpClient } from '@angular/common/http';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-image',
  templateUrl: './image.component.html',
  styleUrls: ['./image.component.css']
})
export class ImageComponent {
  imagesUrl: Array<{url: string}>= [];
  @Input() id?: number; 

  constructor( 
    private http: HttpClient 
    ){ }

    ngOnInit( ){
    console.log(this.id);
    this.http.post<{url: string}[]> ('/api/house', { id: this.id }).subscribe( i => { this.imagesUrl=i ; console.log(i[0].url)});
  }
}
