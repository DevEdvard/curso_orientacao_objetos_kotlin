package br.com.trilhaKotlin.colecoes.parte1.list.teste

import br.com.trilhaKotlin.colecoes.parte1.list.objetos.Livro

fun testaListaComNulos() {
    val livro1 = Livro(
        "Grande Sertão: Veredas",
        "João Guimarães Rosa",
        1956
    )

    val livro2 = Livro(
        "Minha vida de menina",
        "Helena Morley",
        1942,
        "Editora A"
    )

    val livro3 = Livro(
        "Memória Póstumas de Brás Cubas",
        "Machado de Assis",
        1881
    )

    val livro4 = Livro(
        "Iracema",
        "José de Alencar",
        1865,
        "Editora B"
    )

    val listaLivrosComNulo: MutableList<Livro?> =
        mutableListOf(livro1, livro2, livro3, null, livro4, null)

//    listaLivrosComNulo.imprimeComMarcadores()
    listaLivrosComNulo
        .groupBy { it?.editora ?: "Editora desconhecida" }
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it?.titulo.toString() }}")
        }
}