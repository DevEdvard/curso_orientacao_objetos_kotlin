package br.com.trilhaKotlin.bytebank.teste

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(2, 3))


    val calculadoraBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100
    }
    println(calculadoraBonificacaoAnonima(1000.0))
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(24, 10))

    val calculaBonficacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        salario + 100
    }
    println(calculaBonficacao(1001.0))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses = soma()
    println(minhaFuncaoClasses(10, 5))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(2, 2))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}