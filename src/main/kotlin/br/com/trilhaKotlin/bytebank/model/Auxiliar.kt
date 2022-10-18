package br.com.trilhaKotlin.bytebank.model

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : br.com.trilhaKotlin.bytebank.model.Funcionario(
    nome,
    cpf,
    salario
) {
    override val bonificacao: Double
        get() = salario * 0.05
}