package br.com.trilhaKotlin.bytebank.model

class ContaCorrente(
    titular: br.com.trilhaKotlin.bytebank.model.Cliente,
    numero: Int
) : br.com.trilhaKotlin.bytebank.model.Conta(
    titular = titular,
    numero = numero
) {
    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}