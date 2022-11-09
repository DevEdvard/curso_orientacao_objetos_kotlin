import br.com.trilhaKotlin.bytebank.model.Autenticavel
import br.com.trilhaKotlin.bytebank.model.Endereco
import br.com.trilhaKotlin.bytebank.model.SistemaInterno

fun main() {
//    val endereco = Endereco(logradouro = "Rua Aurora", numero = 34)
//    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase()
//    println(enderecoMaiusculo)

    Endereco(logradouro = "Rua Aurora", numero = 34).let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}".uppercase()
    }.let(::println)

    listOf(
        Endereco(logradouro = "Av. Paulista"),
        Endereco(),
        Endereco("Rua Vergueiro")
    )
        .filter { endereco -> endereco.logradouro.isNotEmpty() }
        .let(::println)
    //.let(block = (::println)

    //soma(1, 5, resultado = (::println))
    soma(1, 5) {
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}