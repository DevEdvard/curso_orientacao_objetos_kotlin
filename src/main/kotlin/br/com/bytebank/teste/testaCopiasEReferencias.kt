import br.com.bytebank.model.Cliente
import br.com.bytebank.model.ContaCorrente

fun testaCopiasEReferencias() {
    val eduardo = Cliente("Eduardo", "", senha = 1)

    val contaEduardo = ContaCorrente(titular = eduardo,numero =  1000)

    val contaAlex = ContaCorrente(Cliente("Alex", "", senha = 2), 1001)

//    println(contaEduardo.titular)
//    println(contaAlex.titular)

    println(contaEduardo.saldo)
    contaEduardo.depositar(70.0)
    println(contaEduardo.saldo)
}