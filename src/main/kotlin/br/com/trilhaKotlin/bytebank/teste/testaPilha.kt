package br.com.trilhaKotlin.bytebank.teste

import br.com.trilhaKotlin.bytebank.exception.SaldoInsuficienteException

fun funcao1() {
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw br.com.trilhaKotlin.bytebank.exception.SaldoInsuficienteException()
    }
    println("fim funcao2")
}