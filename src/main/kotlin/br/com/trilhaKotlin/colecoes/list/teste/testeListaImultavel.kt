package br.com.trilhaKotlin.colecoes.list.teste

import br.com.trilhaKotlin.colecoes.list.funcoes.imprimeComMarcadores
import br.com.trilhaKotlin.colecoes.list.objetos.Prateleira

fun testaListaImultavel() {
    val prateleira = Prateleira("Literatura", listaDeLivros())

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}