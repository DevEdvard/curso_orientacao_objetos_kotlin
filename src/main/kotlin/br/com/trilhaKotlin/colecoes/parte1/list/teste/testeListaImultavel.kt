package br.com.trilhaKotlin.colecoes.parte1.list.teste

import br.com.trilhaKotlin.colecoes.parte1.list.funcoes.imprimeComMarcadores
import br.com.trilhaKotlin.colecoes.parte1.list.objetos.Prateleira

fun testaListaImultavel() {
    val prateleira = Prateleira("Literatura", listaDeLivros())

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}