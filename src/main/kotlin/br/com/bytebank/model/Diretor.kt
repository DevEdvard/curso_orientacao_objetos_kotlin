package br.com.bytebank.model

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome,
    cpf,
    salario,
    senha
) {
    override val bonificacao: Double
        get() {
            return salario + plr
        }

    override fun retornaDados() {
        println("Nome: ${this.nome}")
        println("CPF: ${this.cpf}")
        println("Salario: ${this.salario}")
        println("Bonificação: ${this.bonificacao}")
        println("PLR: ${this.plr}")
    }
}