import { Injectable } from '@angular/core';
import { Headers, Response, Http } from '@angular/http';

 
import { Category } from './category';
import { Observable } from 'rxjs';

@Injectable()
export class CategoryDataService {

   private categoriesUrl = 'http://localhost:8080/ProductRest/categories';

  constructor(private http: Http) { }


     getCategories(): Observable<Category[]> {
 //       const productsUrl = 'http://localhost:8080/ProductRest/categories';
    return this.http.get(this.categoriesUrl)
      .map( response => response.json())
      .catch(this.handleError); 
   }
  


  getCategory(id: number): Observable<Category>  {
    
       const url = `${this.categoriesUrl}/${id}`;
      return this.http.get(url)
      .map( response => response.json())
      .catch(this.handleError); 
  }
  
   private handleError(error: any) {
    console.log('An error occured: ', error);
    return Observable.throw(error);
  }
}
