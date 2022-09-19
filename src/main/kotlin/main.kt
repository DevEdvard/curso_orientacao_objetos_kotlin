fun main() {
    println("Bem-vindo ao Bytebank")

    val eduardo = Funcionario("Eduardo",
        "111.111.111-11",
        1000.0)

    println("Nome: ${eduardo.nome}")
    println("CPF: ${eduardo.cpf}")
    println("Salario: ${eduardo.salario}")
    println("Bonificação: ${eduardo.bonoficacao()}")

    val fran = Gerente(
        "Fran",
        "222.222.222-22",
        2000.0,
        1234
    )

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salario: ${fran.salario}")
    println("Bonificação: ${fran.bonoficacao()}")

    if(fran.autentica(1234)){
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autentificação")
    }
}

