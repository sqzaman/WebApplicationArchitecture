import { Injectable } from '@angular/core';
import { Headers, Response, Http } from '@angular/http';

//import 'rxjs/add/operator/toPromise';
import {Observable} from 'rxjs';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import { Product } from './product';

@Injectable()
export class ProductDataService {

   private productsUrl = 'http://localhost:8080/ProductRest/products';

  constructor(private http: Http) { }

   getProducts(): Observable<Product[]> {
        const productsUrl = 'http://localhost:8080/ProductRest/products';
    return this.http.get(productsUrl)
      .map( response => response.json())
      .catch(this.handleError); 
   }
  
  getProduct(id: number): Observable<Product>  {
    
       const url = `${this.productsUrl}/${id}`;
      return this.http.get(url)
      .map( response => response.json())
      .catch(this.handleError); 
    
//    return this.getProducts();  //.subscribe(products => products.find(product => product.id === id))
  }

  private post(product: Product): Observable<Product> {
    const headers = new Headers({'Content-Type': 'application/json'});
    const productsUrl = 'http://localhost:8080/ProductRest/products';
    
     return this.http.post(productsUrl, product, {headers:headers})
       .map( response => response.json())
               .catch(this.handleError);
  }

  private put(product: Product) {
    const headers = new Headers();
    headers.append('Content-Type', 'application/json');

    const url = `${this.productsUrl}/${product.id}`;

    return this.http.put(url, JSON.stringify(product), {headers: headers}).map(() => product).catch(this.handleError);
  }

   save(product: Product): Observable<Product> {
       return this.post(product);

  }
   update(product: Product): Observable<Product> {
       return this.put(product);

  }
 
   private handleError(error: any) {
    console.log('An error occured: ', error);
    return Observable.throw(error);
  }
}
