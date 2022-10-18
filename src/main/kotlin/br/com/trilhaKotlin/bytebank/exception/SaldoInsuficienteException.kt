package br.com.trilhaKotlin.bytebank.exception

class SaldoInsuficienteException(mensagem: String = "O saldo é insuficiente") : Exception(mensagem)