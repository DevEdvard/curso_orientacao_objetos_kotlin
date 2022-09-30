package br.com.bytebank.model

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo: Double = 0.0
        protected set

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

    open fun transferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo = saldo.minus(valor)
            destino.depositar(valor)
            return true
        }
        return false
    }
}