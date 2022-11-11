package br.com.trilhaKotlin.bytebank.teste

import br.com.trilhaKotlin.bytebank.model.Autenticavel
import br.com.trilhaKotlin.bytebank.model.SistemaInterno

fun testaHOF() {
    //soma(1, 5, resultado = (::println))
    soma(1, 5) {
        println(it)
    }

//    somaReceiver(2, 5, (::println))
    somaReceiver(2, 5) {
        println(this)
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })
    sistema.entraReceiver(autenticavel, 1234, autenticado = {
        pagamento()
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    val total = a + b
    total.resultado()
}