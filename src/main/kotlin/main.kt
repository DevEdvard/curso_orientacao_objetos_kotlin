fun main() {
    println("Bem-vindo ao Bytebank")
    testaCopiasEReferencias()
}

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

private fun testaCopiasEReferencias() {
    val contaEduardo = Conta(titular = "Eduardo",numero =  1000,saldo =  300.0)

    val contaAlex = Conta("Alex", 1001, 3000.0)

//    println(contaEduardo.titular)
//    println(contaAlex.titular)

    println(contaEduardo.saldo)
    contaEduardo.depositar(70.0)
    println(contaEduardo.saldo)

}

private fun testaLacos() {
    for (i in 6 downTo 1 step 2) {
        val titular = "Eduardo $i"
        val numeroConta = 1000
        var saldo = 0.0

//    saldo = 100.0
//    saldo += 200
        saldo += 863 * i

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")

        when {
            saldo > 0.0 -> println("Conta é positiva")
            saldo == 0.0 -> println("Conta é neutra")
            else -> println("Conta é negativa")
        }

        println()
    }
}

private fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }
}