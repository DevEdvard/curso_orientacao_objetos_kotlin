package br.com.bytebank.model

import br.com.bytebank.exception.FalhaAutenticacaoException
import br.com.bytebank.exception.SaldoInsuficienteException
import java.lang.NumberFormatException

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo: Double = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
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

    open fun transferir(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException("O saldo é insuficiente, saldo atual: $saldo")
        }
        if (!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
//        throw NumberFormatException
        saldo = saldo.minus(valor)
        destino.depositar(valor)
    }
}