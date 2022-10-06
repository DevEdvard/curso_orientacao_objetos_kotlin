package br.com.bytebank.teste

fun testaClasseNumber() {
    val x: Int = 15
    val y: Double = 14.5

    teste(x)
    teste(y)

    println(x.toDouble())
    println(y.toLong())
}

fun teste(numero: Number) {
    println(numero)
}
