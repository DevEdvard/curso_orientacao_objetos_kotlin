package br.com.trilhaKotlin.bytebank.exception

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticalçao"
) : Exception(mensagem) {
}