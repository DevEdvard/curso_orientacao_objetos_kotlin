package br.com.trilhaKotlin.colecoes.list

import br.com.trilhaKotlin.colecoes.parte1.list.funcoes.imprimeComMarcadores
import br.com.trilhaKotlin.colecoes.parte1.list.objetos.Livro
import br.com.trilhaKotlin.colecoes.parte1.list.teste.listaDeLivros

fun testaLista() {
    val livros = listaDeLivros()

    livros.add(
        Livro(
            "Sagarana",
            "João Guimarães Rosa",
            1946
        )
    )

    livros.imprimeComMarcadores()

//    livros.remove(livro1)
//    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()

    livros.filter { it.autor == "João Guimarães Rosa" }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    val titulos = livros.filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titulos)
}