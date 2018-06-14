function limparLista() {
    $.each($('#listaCursos').get(0), function(item) {
        item.remove();
    });
}

function exibirCursos() {
    limparLista();
    $.each([
        {
            "id": "curso-1",
            "titulo": "Desenvolvimento de Soluções"
        }, {
            "id": "curso-2",
            "titulo": "Arquitetura Java"
        }, {
            "id": "curso-3",
            "titulo": "Arquitetura .NET"
        }, {
            "id": "curso-4",
            "titulo": "Projetos Integrados"
        }, {
            "id": "curso-5",
            "titulo": "Gestão de Processos"
        }, {
            "id": "curso-6",
            "titulo": "Compiladores"
        }
    ], function(id, item) {
        $('#listaCursos').append($('<option>').attr({ 'value': item.id }).text(item.titulo))
    })
}
exibirCursos(); 