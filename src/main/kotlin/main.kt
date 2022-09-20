fun main() {
    println("Bem-vindo ao Bytebank")

    val eduardo = Funcionario("Eduardo",
        "111.111.111-11",
        1000.0)

    eduardo.retornaDados()
    println()

    val fran = Gerente(
        "Fran",
        "222.222.222-22",
        2000.0,
        1234
    )

    fran.retornaDados()

    if(fran.autentica(1234)){
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autentificação")
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

    if(gui.autentica(1234)){
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autentificação")
    }
    println()
}

