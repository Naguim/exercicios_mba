import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms'; 
import { HttpModule } from '@angular/http'; 

import { appRoutes } from './rotas/app.routes'; //deve vir primeiro

import { AppComponent }  from './app.component';
import { MenuComponent } from './menu/menu.component'; 
import { SubLista } from './filtros/sublista.filter'; 

//usado nas rotas
import { HomeComponent } from './home/home.component';
import { CadastroComponent } from './cadastro/cadastro.component';
import { NotFoundComponent } from './erro/erro404.component'; 
import { EventosService } from './servicos/eventos.service'; 
@NgModule({
  imports:      [ BrowserModule, RouterModule.forRoot(appRoutes) , FormsModule, HttpModule],
  declarations: [ AppComponent, MenuComponent, HomeComponent,
    CadastroComponent,
    NotFoundComponent, SubLista  ],
  providers : [ EventosService ], 
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
