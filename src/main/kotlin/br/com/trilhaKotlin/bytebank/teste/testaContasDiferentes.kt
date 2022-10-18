import br.com.trilhaKotlin.bytebank.exception.FalhaAutenticacaoException
import br.com.trilhaKotlin.bytebank.exception.SaldoInsuficienteException
import br.com.trilhaKotlin.bytebank.model.Cliente
import br.com.trilhaKotlin.bytebank.model.ContaCorrente
import br.com.trilhaKotlin.bytebank.model.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = br.com.trilhaKotlin.bytebank.model.ContaCorrente(
        titular = br.com.trilhaKotlin.bytebank.model.Cliente("Eduardo", "", senha = 1),
        numero = 1000
    )

    val contaPoupanca = br.com.trilhaKotlin.bytebank.model.ContaPoupanca(
        titular = br.com.trilhaKotlin.bytebank.model.Cliente("Fran", "", senha = 2),
        numero = 1001
    )

    contaCorrente.depositar(200.0)
    contaPoupanca.depositar(200.0)

    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldo}")

    try {
        contaCorrente.transferir(80.0, contaPoupanca, 1234)
        println("Tranferência sucedida")
    } catch (e: br.com.trilhaKotlin.bytebank.exception.SaldoInsuficienteException) {
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: br.com.trilhaKotlin.bytebank.exception.FalhaAutenticacaoException) {
        println("Falha na transferência")
        println("Falha na auteticação")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println("Saldo conta corrente após tranferencia: ${contaCorrente.saldo}")
    println("Saldo conta poupança após tranferencia: ${contaPoupanca.saldo}")
}