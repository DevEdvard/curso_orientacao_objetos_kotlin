package br.com.trilhaKotlin.bytebank.model

class SistemaInterno {
    fun entra(admin: br.com.trilhaKotlin.bytebank.model.Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem-vindo ao Bytebank")
        } else {
            println("Falha na autentificação")
        }
    }
}