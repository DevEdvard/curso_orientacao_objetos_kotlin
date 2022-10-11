package br.com.bytebank.teste

private fun testaExpressao() {
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

    if (valor != null) {
        println("Valor recebido: $valor")
    } else {
        println("Valor inválido")
    }
}