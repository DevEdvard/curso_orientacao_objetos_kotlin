fun testaCopiasEReferencias() {
    val contaEduardo = Conta(titular = "Eduardo",numero =  1000,saldo =  300.0)

    val contaAlex = Conta("Alex", 1001, 3000.0)

//    println(contaEduardo.titular)
//    println(contaAlex.titular)

    println(contaEduardo.saldo)
    contaEduardo.depositar(70.0)
    println(contaEduardo.saldo)
}