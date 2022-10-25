fun main() {
    val banco = BancoDeNomes()
    val nomesSalvos = banco.nomes
//    nomesSalvos.add("Sandra")
    banco.salva("Eduardo")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes = mutableListOf("Alex", "Fran", "Gui", "Maria", "Ana")

    for (nome in nomes) {
        println(nome)
    }
    nomes.add("Paulo")
    nomes.remove("Alex")
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção: ${nomes.size}")
}