import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Hello Demo';
  username = '';

// Lifecycle hook -- Call on every change detection run...
   ngDoCheck() {
     console.log('User Name= ' + this.username);
   }
  

}
