package br.com.trilhaKotlin.bytebank.model

class ContaPoupanca(
    titular: br.com.trilhaKotlin.bytebank.model.Cliente,
    numero: Int
) : br.com.trilhaKotlin.bytebank.model.Conta(
    titular = titular,
    numero = numero
) {
    override fun sacar(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}