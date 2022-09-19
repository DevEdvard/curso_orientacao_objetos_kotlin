class Conta(val titular: String, val numero: Int, saldo: Double) {
    var saldo: Double = saldo
        private set

//    constructor(titular: String, numero: Int, saldo: Double) : this() {
//        this.titular = titular
//        this.numero = numero
//        this.saldo = saldo
//    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo = saldo.plus(valor)
        }
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo = saldo.minus(valor)
        }
    }

    fun transferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo = saldo.minus(valor)
            destino.depositar(valor)
            return true
        }
        return false
    }
}