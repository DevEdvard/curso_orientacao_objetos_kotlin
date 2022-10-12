import br.com.bytebank.model.Endereco

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Aurora", cep = "00000-000")
    val logradouroNovo: String? = enderecoNulo?.logradouro
//    enderecoNulo = null
    enderecoNulo?.let {endereco: Endereco ->
        println(endereco.logradouro.length)
        val tamanhoComplemento: Int = endereco.cep?.length ?: 0
        println(tamanhoComplemento)
    }
}