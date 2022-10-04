package br.com.bytebank.teste

import br.com.bytebank.model.*
import testaContasDiferentes

private fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)
    println("Nome do cliente: ${fran.nome}")

    val eduardo = Cliente(nome = "Eduardo", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = eduardo, numero = 1001)
    val contaCorrente = ContaCorrente(titular = eduardo, numero = 1002)

    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}
