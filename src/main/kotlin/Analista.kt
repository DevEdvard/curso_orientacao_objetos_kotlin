class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    var senha: Int
) : Funcionario(
    nome,
    cpf,
    salario
) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario
        }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}