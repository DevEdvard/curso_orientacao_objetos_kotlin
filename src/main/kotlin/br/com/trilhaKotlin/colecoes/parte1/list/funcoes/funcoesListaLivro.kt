package br.com.trilhaKotlin.colecoes.parte1.list.funcoes

import br.com.trilhaKotlin.colecoes.parte1.list.objetos.Livro

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString("\n") {
            " - ${it.titulo} de ${it.autor}"
        }
    println(" #### Lista de Livros #### \n$textoFormatado")
}