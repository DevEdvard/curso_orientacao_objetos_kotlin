import br.com.bytebank.exception.SaldoInsuficienteException
import br.com.bytebank.model.Cliente
import br.com.bytebank.model.ContaCorrente
import br.com.bytebank.model.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente("Eduardo", "", senha = 1),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente("Fran", "", senha = 2),
        numero = 1001
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldo}")

    try {
        contaCorrente.transferir(100.0, contaPoupanca)
        println("Tranferência sucedida")
    } catch (e: SaldoInsuficienteException){
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    }
    println("Saldo conta corrente após tranferencia: ${contaCorrente.saldo}")
    println("Saldo conta poupança após tranferencia: ${contaPoupanca.saldo}")
}