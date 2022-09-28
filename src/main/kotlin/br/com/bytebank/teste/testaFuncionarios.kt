import br.com.bytebank.model.*

fun testaFuncionarios() {
    val eduardo = Auxiliar(
        "Eduardo",
        "111.111.111-11",
        1000.0
    )

    eduardo.retornaDados()
    println()

    val fran = Gerente(
        "Fran",
        "222.222.222-22",
        2000.0,
        1234
    )

    fran.retornaDados()

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação")
    }
    println()

    val gui = Diretor(
        "Gui",
        "222.222.222-22",
        4000.0,
        12345,
        2000.0
    )

    gui.retornaDados()

    if (gui.autentica(1234)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação")
    }
    println()

    val maria = Analista("Maria", "444.444.444-44", 2500.0)
    maria.retornaDados()
    println()

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(eduardo)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de bonificação: ${calculadora.total}")
}