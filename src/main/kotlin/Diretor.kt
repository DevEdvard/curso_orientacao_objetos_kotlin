class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    var senha: Int,
    val plr: Double
) : Funcionario(
    nome,
    cpf,
    salario
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

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}