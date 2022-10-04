package br.com.bytebank.model

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
//        funcionario as Funcionario
//        if (funcionario is Funcionario)
            this.total += funcionario.bonificacao
    }

}