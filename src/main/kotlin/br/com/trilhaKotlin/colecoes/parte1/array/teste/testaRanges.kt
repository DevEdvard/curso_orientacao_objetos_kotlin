package br.com.trilhaKotlin.colecoes.parte1.array.teste

fun testaRanges() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }
    println()

//    val numerosPares = 0..100 step 2
//    for(numeroPar in numerosPares){
//        print("$numeroPar ")
//    }
//
//    val numerosPares = 0.until(100) step 2
//    for(numeroPar in numerosPares){
//        print("$numeroPar ")
//    }

    val numerosParesReversos = 100 downTo 0 step 2
    numerosParesReversos.forEach { print("$it ") }
    println()

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}