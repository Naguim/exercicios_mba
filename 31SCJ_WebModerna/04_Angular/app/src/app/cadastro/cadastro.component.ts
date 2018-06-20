import { Component } from '@angular/core';
import { IEvento } from './../interfaces/interface.evento';
import { EventosService } from '../servicos/eventos.service';
@Component({
    templateUrl: './views/cadastro.component.html'
})
export class CadastroComponent {
    //para um evento selecionado
    public eventoSelecionado: IEvento
    public listaEventos: IEvento[]
    private novoEvento: IEvento;
    constructor(private eventosService: EventosService) {
        //this.listaEventos = eventosService.getEventos();
        this.listar();
    }

    //para a inclusão de um novo evento
    public novo() {
        this.novoEvento = { descricao: '', data: '', preco: 0 }
        this.eventoSelecionado = this.novoEvento;
    }

    // public incluir(evento: IEvento) {
    //     this.listaEventos.push(evento);
    //     alert('Evento incluído com sucesso');
    // }
    public incluir(evento: IEvento) {
        //this.listaEventos.push(evento);
        this.eventosService.setEventoWS(evento)
            .subscribe(res => JSON.stringify(res),
            error => alert(error),
            () => this.listar());
        alert('Evento incluído com sucesso');
    }

    public listar(): void {
        this.eventosService.getEventosWS()
            .subscribe(res => this.listaEventos = res,
            error => alert(error),
            () => console.log('finalizado'));
    }

}