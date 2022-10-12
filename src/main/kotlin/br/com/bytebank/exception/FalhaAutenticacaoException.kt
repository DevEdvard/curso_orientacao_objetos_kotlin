package br.com.bytebank.exception

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticalçao"
) : Exception(mensagem) {
}