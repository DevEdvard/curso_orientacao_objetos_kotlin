package br.com.trilhaKotlin.bytebank.model

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected var senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), br.com.trilhaKotlin.bytebank.model.Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}