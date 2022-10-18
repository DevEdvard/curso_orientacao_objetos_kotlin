package br.com.trilhaKotlin.bytebank.teste

fun testaDataClass() {
    val eduardo = Pessoa("Eduardo", 23)
    eduardo.fala()
    val (nome) = eduardo
    println("Nome: $nome")
    val documento = Documento(
        rg = "12345678-9",
        cpf = "123.456.789-01"
    )
    val documentoCopia = documento.copy()
    val (rg, cpf) = documento
    println("Rg: $rg, Cpf: $cpf")
    println(documento == documentoCopia)
    println(eduardo)
    println(documento)
    println(documentoCopia)
    println(documento.hashCode())
}

class Pessoa(val nome: String, val idade: Int) {
    fun fala() {
        println("Falando")
    }

    operator fun component1() = this.nome
}

data class Documento(val rg: String, val cpf: String)