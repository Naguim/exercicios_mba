import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/map';

/*
  Generated class for the RemoteServiceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class RemoteServiceProvider {
  url: string = "http://localhost:3000/contatos";

  constructor(public http: Http) { }
  
  getContatos() {
    return this.http.get(this.url)
      .map((res: Response) => res.json());
  }
  incluir(json) {
    let header = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: header });

    return this.http.post(this.url, json, options)
      .map((res: Response) => res.json());
  }
}
