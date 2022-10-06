package br.com.bytebank.teste

fun testaStrings() {
    val palavra = "palavra"
    val palavraNova = palavra

    for (c in palavra) {
        println(c)
        println(c == 'a')
    }

    val substring = palavra.substring(4)
    println(substring)
}