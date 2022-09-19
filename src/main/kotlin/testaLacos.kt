fun testaLacos() {
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