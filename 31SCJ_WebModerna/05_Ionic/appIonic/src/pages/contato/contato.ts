import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { RemoteServiceProvider } from '../../providers/remote-service/remote-service';

/**
 * Generated class for the ContatoPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@Component({
 selector: 'page-contato',
 templateUrl: 'contato.html',
}) 
export class ContatoPage {
  titulo: string; 
  name: string;
  
  constructor(private service: RemoteServiceProvider) {
    this.titulo = "Gestão de Contatos"; 
  }
  
  public getTitulo(): string {
    return "App: " + this.titulo;
  }

  //para a inclusão de um novo evento
  public incluir() {
    this.service.incluir({ nome: "testeee", telefone: '', datanascimento: '' })
    .subscribe(res => JSON.stringify(res),
    error => alert(error));
  } 

  public salvar(): string {
    console.log(this.name);
    return "eee";
  }

}
