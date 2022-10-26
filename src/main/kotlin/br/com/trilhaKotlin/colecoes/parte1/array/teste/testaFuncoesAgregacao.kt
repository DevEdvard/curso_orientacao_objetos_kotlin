package br.com.trilhaKotlin.colecoes.parte1.array.teste

fun testaFuncoesAgregacao() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val mediaIdades = idades.average()
    println("Média de idades: $mediaIdades")

    val todosMaioresIdade = idades.all { it >= 18 }
    println("Todos maiores de idade? $todosMaioresIdade")

    val existeMaiorIdade = idades.any { it >= 18 }
    println("Algum é maior de idade? $existeMaiorIdade")

    val maiores = idades.filter { it >= 18 }
    println("Maiores de idade: $maiores")

    val busca = idades.find { it >= 18 }
    println("Busca: $busca")
}