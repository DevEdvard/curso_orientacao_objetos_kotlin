package br.com.trilhaKotlin.bytebank.model

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : br.com.trilhaKotlin.bytebank.model.Funcionario(
    nome,
    cpf,
    salario
) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }
}