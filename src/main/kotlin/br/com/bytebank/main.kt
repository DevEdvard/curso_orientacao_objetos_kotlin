import br.com.bytebank.model.Endereco

fun main() {
    val endereco = Endereco(cep = "00000-000")
    val enderecoNovo = Endereco(cep = "00000-001")

    println(endereco.equals(endereco))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco)
    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")

    print(endereco.equals(enderecoNovo))
}

fun imprime(valor: Any) {
    println(valor)
}


