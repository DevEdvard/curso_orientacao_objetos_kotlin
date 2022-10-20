package br.com.trilhaKotlin.colecoes.list

fun testaLista() {
    val livro1 = Livro(
        "Grande Sertão: Veredas",
        "João Guimarães Rosa",
        1956
    )

    val livro2 = Livro(
        "Minha vida de menina",
        "Helena Morley",
        1942,
        "Editora A"
    )

    val livro3 = Livro(
        "Memória Póstumas de Brás Cubas",
        "Machado de Assis",
        1881
    )

    val livro4 = Livro(
        "Iracema",
        "José de Alencar",
        1865,
        "Editora B"
    )

    val livros: MutableList<Livro> =
        mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            "Sagarana",
            "João Guimarães Rosa",
            1946
        )
    )

    livros.imprimeComMarcadores()

//    livros.remove(livro1)
//    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()

    livros.filter { it.autor == "João Guimarães Rosa" }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    val titulos = livros.filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titulos)
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString("\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de Livros #### \n$textoFormatado")
}