package br.com.trilhaKotlin.bytebank.teste

import br.com.trilhaKotlin.bytebank.model.Endereco

fun testaMetodosAny() {
    val endereco = br.com.trilhaKotlin.bytebank.model.Endereco(cep = "00000-000")
    val enderecoNovo = br.com.trilhaKotlin.bytebank.model.Endereco(cep = "00000-001")

    println(endereco.equals(endereco))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco)
    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")

    print(endereco.equals(enderecoNovo))

    fun imprime(valor: Any) {
        println(valor)
    }
}