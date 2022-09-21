fun testaAutenticacao() {
    val eduardo = Gerente(
        "Eduardo",
        "111.111.111-11",
        1000.0,
        1000
    )

    SistemaInterno().entra(eduardo, 1000)
}