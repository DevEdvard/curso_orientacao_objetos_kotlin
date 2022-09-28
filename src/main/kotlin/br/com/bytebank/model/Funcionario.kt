package br.com.bytebank.model

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {
    abstract val bonificacao: Double

    open fun retornaDados() {
        println("Nome: ${this.nome}")
        println("CPF: ${this.cpf}")
        println("Salario: ${this.salario}")
        println("Bonificação: ${this.bonificacao}")
    }
}