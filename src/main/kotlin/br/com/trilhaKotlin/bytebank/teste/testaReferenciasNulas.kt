package br.com.trilhaKotlin.bytebank.teste

fun testaReferenciasNulas() {
    var enderecoNulo: br.com.trilhaKotlin.bytebank.model.Endereco? =
        br.com.trilhaKotlin.bytebank.model.Endereco(logradouro = "Rua Aurora", cep = "00000-000")
    val logradouroNovo: String? = enderecoNulo?.logradouro
//    enderecoNulo = null
    enderecoNulo?.let { endereco: br.com.trilhaKotlin.bytebank.model.Endereco ->
        println(endereco.logradouro.length)
        val tamanhoComplemento: Int = endereco.cep?.length ?: 0
        println(tamanhoComplemento)
    }
}