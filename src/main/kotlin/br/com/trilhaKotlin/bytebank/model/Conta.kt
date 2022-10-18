package br.com.trilhaKotlin.bytebank.model

import br.com.trilhaKotlin.bytebank.exception.FalhaAutenticacaoException
import br.com.trilhaKotlin.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    val titular: br.com.trilhaKotlin.bytebank.model.Cliente,
    val numero: Int
) : br.com.trilhaKotlin.bytebank.model.Autenticavel {
    var saldo: Double = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        br.com.trilhaKotlin.bytebank.model.Conta.Companion.total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

//    constructor(titular: String, numero: Int, saldo: Double) : this() {
//        this.titular = titular
//        this.numero = numero
//        this.saldo = saldo
//    }

    open fun depositar(valor: Double) {
        if (valor > 0) {
            saldo = saldo.plus(valor)
        }
    }

    abstract fun sacar(valor: Double)

    open fun transferir(valor: Double, destino: br.com.trilhaKotlin.bytebank.model.Conta, senha: Int) {
        if (saldo < valor) {
            throw br.com.trilhaKotlin.bytebank.exception.SaldoInsuficienteException("O saldo é insuficiente, saldo atual: $saldo")
        }
        if (!autentica(senha)){
            throw br.com.trilhaKotlin.bytebank.exception.FalhaAutenticacaoException()
        }
//        throw NumberFormatException
        saldo = saldo.minus(valor)
        destino.depositar(valor)
    }
}