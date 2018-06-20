import { Component } from '@angular/core';
import { MenuComponent } from './menu/menu.component'; 
import { SubLista } from './filtros/sublista.filter'; 
@Component({
  selector: 'my-app',
  template: '<menu></menu>',
})
export class AppComponent  { name = 'Angular'; }
