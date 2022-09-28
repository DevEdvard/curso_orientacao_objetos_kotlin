fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("br.com.bytebank.model.Conta é positiva")
    } else if (saldo == 0.0) {
        println("br.com.bytebank.model.Conta é neutra")
    } else {
        println("br.com.bytebank.model.Conta é negativa")
    }
}