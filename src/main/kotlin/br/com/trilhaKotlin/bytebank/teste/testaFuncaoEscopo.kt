package br.com.trilhaKotlin.bytebank.teste

import br.com.trilhaKotlin.bytebank.model.Endereco

fun testaFuncoesEscopo() {
    //    val endereco = Endereco(logradouro = "Rua Aurora", numero = 34)
//    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase()
//    println(enderecoMaiusculo)

    val endereco1 = Endereco(logradouro = "Rua Aurora", numero = 34)
        .also { println("Criando endereço") }
//        .run {
//            "$logradouro, $numero".uppercase()
//        }.let(::println)
    with(endereco1) {
        "$logradouro, $numero".uppercase()
    }.let(::println)

    listOf(
        Endereco(logradouro = "Av. Paulista"),
        Endereco(),
        Endereco("Rua Vergueiro")
    )
        .filter { endereco -> endereco.logradouro.isNotEmpty() }
        .let(::println)
    //.let(block = (::println))
}