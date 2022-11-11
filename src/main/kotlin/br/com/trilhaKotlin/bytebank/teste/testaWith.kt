package br.com.trilhaKotlin.bytebank.teste

import br.com.trilhaKotlin.bytebank.model.Endereco

fun testaWith() {
    val enderecoCompleto = with(Endereco()) {
        logradouro = "Rua vergueiro"
        numero = 123
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "0000-000"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}