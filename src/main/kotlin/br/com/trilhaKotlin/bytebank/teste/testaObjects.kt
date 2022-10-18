package br.com.trilhaKotlin.bytebank.teste

import br.com.trilhaKotlin.bytebank.model.SistemaInterno
import testaContasDiferentes

fun testaObjects() {
    val fran = object : br.com.trilhaKotlin.bytebank.model.Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)
    println("Nome do cliente: ${fran.nome}")

    val eduardo = br.com.trilhaKotlin.bytebank.model.Cliente(nome = "Eduardo", cpf = "", senha = 1)
    val contaPoupanca = br.com.trilhaKotlin.bytebank.model.ContaPoupanca(titular = eduardo, numero = 1001)
    val contaCorrente = br.com.trilhaKotlin.bytebank.model.ContaCorrente(titular = eduardo, numero = 1002)

    testaContasDiferentes()

    println("Total de contas: ${br.com.trilhaKotlin.bytebank.model.Conta.total}")
}
