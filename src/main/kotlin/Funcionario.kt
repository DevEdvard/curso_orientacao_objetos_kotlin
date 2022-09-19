class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {
    fun bonoficacao(): Double {
        return salario * 0.1
    }
}