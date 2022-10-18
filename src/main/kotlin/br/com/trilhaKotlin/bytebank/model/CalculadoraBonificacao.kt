package br.com.trilhaKotlin.bytebank.model

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: br.com.trilhaKotlin.bytebank.model.Funcionario) {
//        funcionario as Funcionario
//        if (funcionario is Funcionario)
            this.total += funcionario.bonificacao
    }

}