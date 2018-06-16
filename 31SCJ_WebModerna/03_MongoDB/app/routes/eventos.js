module.exports = function (app) {
    var valida = require('./../middlewares/valida')

    var eventos = app.controllers.eventos;
    app.get('/menu', valida, eventos.menu);

    app.get('/cadUsuario', valida, eventos.cadastroUsuario);
    app.post('/novoUsuario', valida, eventos.novoUsuario);
    app.get('/cadEvento', valida,eventos.cadastroEvento);
    app.post('/novoEvento', valida,eventos.novoEvento);
    app.get('/listaEventos', valida, eventos.listaEventos);
}