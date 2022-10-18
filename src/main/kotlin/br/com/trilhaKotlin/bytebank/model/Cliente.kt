package br.com.trilhaKotlin.bytebank.model

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: br.com.trilhaKotlin.bytebank.model.Endereco = br.com.trilhaKotlin.bytebank.model.Endereco(),
    protected val senha: Int
) : br.com.trilhaKotlin.bytebank.model.Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}