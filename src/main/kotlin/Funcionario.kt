open class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {
    open val bonificacao: Double
        get() {
            return salario * 0.1
        }

    open fun retornaDados(){
        println("Nome: ${this.nome}")
        println("CPF: ${this.cpf}")
        println("Salario: ${this.salario}")
        println("Bonificação: ${this.bonificacao}")
    }
}