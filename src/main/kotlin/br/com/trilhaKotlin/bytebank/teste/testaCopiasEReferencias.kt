import br.com.trilhaKotlin.bytebank.model.Cliente
import br.com.trilhaKotlin.bytebank.model.ContaCorrente

fun testaCopiasEReferencias() {
    val eduardo = br.com.trilhaKotlin.bytebank.model.Cliente("Eduardo", "", senha = 1)

    val contaEduardo = br.com.trilhaKotlin.bytebank.model.ContaCorrente(titular = eduardo, numero = 1000)

    val contaAlex = br.com.trilhaKotlin.bytebank.model.ContaCorrente(
        br.com.trilhaKotlin.bytebank.model.Cliente(
            "Alex",
            "",
            senha = 2
        ), 1001
    )

//    println(contaEduardo.titular)
//    println(contaAlex.titular)

    println(contaEduardo.saldo)
    contaEduardo.depositar(70.0)
    println(contaEduardo.saldo)
}