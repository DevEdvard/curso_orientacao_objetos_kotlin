class Gerente(
    val nome: String,
    val cpf: String,
    var salario: Double,
    var senha: Int) {

    fun bonoficacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}