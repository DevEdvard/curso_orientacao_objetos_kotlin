fun main() {
    println("início main")
    try {
        10 / 0
    } catch (e: Exception) {
        e.printStackTrace()
        println("Exception foi pegada")
    }

    val entrada: String = "1.9"
    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }

    if(valor != null){
        println("Valor recebido: $valor")
    } else {
        println("Valor inválido")
    }

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
    }
    println("fim funcao2")
}