import br.com.bytebank.model.ContaCorrente

fun testaCopiasEReferencias() {
    val contaEduardo = ContaCorrente(titular = "Eduardo",numero =  1000)

    val contaAlex = ContaCorrente("Alex", 1001)

//    println(contaEduardo.titular)
//    println(contaAlex.titular)

    println(contaEduardo.saldo)
    contaEduardo.depositar(70.0)
    println(contaEduardo.saldo)
}