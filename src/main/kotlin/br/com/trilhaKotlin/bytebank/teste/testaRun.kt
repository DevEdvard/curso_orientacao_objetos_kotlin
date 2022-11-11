package br.com.trilhaKotlin.bytebank.teste

import br.com.trilhaKotlin.bytebank.model.Cliente
import br.com.trilhaKotlin.bytebank.model.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12

    val contaPoupanca = ContaPoupanca(
        Cliente(
            nome = "Eduardo",
            cpf = "111.111.111-11",
            senha = 1234
        ), 1000
    )
    contaPoupanca.run {
        depositar(1000.0)
        saldo * taxaMensal
    }.let(::println)

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }.let(::println)
}