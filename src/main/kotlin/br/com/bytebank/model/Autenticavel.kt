package br.com.bytebank.model

interface Autenticavel {

    fun autentica(senha: Int) : Boolean

}