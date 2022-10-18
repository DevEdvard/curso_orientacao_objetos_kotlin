package br.com.trilhaKotlin.bytebank.model

interface Autenticavel {

    fun autentica(senha: Int) : Boolean

}