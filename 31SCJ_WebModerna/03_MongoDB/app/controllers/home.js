module.exports = function (app) {
    var mongoose = require('mongoose');
    var Usuario = mongoose.model('usuarios');

    var HomeController = {
        index: function (req, res) {
            res.render('home/index');
        },
        login: function (req, res) {
            var nome = req.body.usuario.nome;
            var senha = req.body.usuario.senha;


            Usuario.findOne().select('nome senha')
                .exec(function (erro, usuario) {
                    if (erro) {
                        res.redirect('/');
                    }
                    else {
                        req.session.usuario = usuario;
                        res.redirect('/menu');
                    }
                });
        },
        logout: function (req, res) {
            req.session.destroy();
            res.redirect('/');
        },
    };
    return HomeController;
}; 