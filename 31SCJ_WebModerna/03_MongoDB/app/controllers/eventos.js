module.exports = function (app) {
    var mongoose = require('mongoose');
    var Evento = app.models.eventos;
    var Usuario = app.models.usuarios;
    
    var EventosController = {
        //chamadas a páginas via get
        menu: function (request, response) {
            var usuario = request.session.usuario,
                params = { usuario: usuario };
            response.render('eventos/menu', params);
        },
        cadastroUsuario: function (request, response) {
            var usuario = request.session.usuario,
                params = { usuario: usuario };
            response.render('eventos/cadUsuario', params);
        },
        //cadastro de usuários
        novoUsuario: function (request, response) {
            var nome = request.body.usuario.nome;
            var senha = request.body.usuario.senha;
            var confirma = request.body.usuario.confirma;

            if ((senha != confirma) || nome.trim().length == 0) {
                response.redirect('/');
            }
            else {
                var usuario = request.body.usuario;
                Usuario.create(usuario, function (erro, usuario) {
                    if (erro) {
                        response.redirect('/');
                    }
                    else {
                        response.redirect('/menu');
                    }
                });
            }
        },
        cadastroEvento: function (request, response) {
            var usuario = request.session.usuario,
                params = { usuario: usuario };
            response.render('eventos/cadEvento', params);
        },
        listaEventos: function (request, response) {
            Evento.find(function (erro, eventos) {
                if (erro) {
                    response.render('/menu');
                }
                else {
                    var usuario = request.session.usuario,
                        params = { usuario: usuario, eventos: eventos };
                    response.render('eventos/listaEventos', params);
                }
            });
        },
        //cadastro de eventos
        novoEvento: function (request, response) {
            var descricao = request.body.evento.descricao;
            var data = request.body.evento.data.split('/');
            //formato dd/MM/yyyy
            var objDate = new Date(data[2], data[1] - 1, data[0]);
            var responsavel = request.body.evento.responsavel;

            if (descricao.trim().length == 0) {
                response.redirect('/cadEvento');
            }
            else {
                var evento = request.body.evento;
                Evento.create(evento, function (erro, evento) {
                    if (erro) {
                        response.redirect('/cadEvento');
                    } else {
                        response.redirect('/menu');
                    }
                });
            }
        }
    };
    return EventosController;
};