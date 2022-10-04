import br.com.bytebank.model.CalculadoraBonificacao
import br.com.bytebank.model.Endereco
import br.com.bytebank.model.Funcionario

fun main() {
    val objeto: Any = Any()

    imprime(objeto)
    imprime(Unit)
    imprime(1)
    imprime(1.0)
    imprime(Endereco())

}

fun imprime(valor: Any){
    println(valor)
}


