package br.com.trilhaKotlin.colecoes.parte2.teste

fun testaAgrupamento() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
    println(pedidos)
    val pedidosMapeados = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 1, valor = 20.0)])

//    val mapa = pedidos.associateBy { pedido ->
//        pedido.valor > 50
//    }
//    println(mapa)

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf("Alex", "Fran", "Gui", "Ana", "Maria", "Mario")

    val agenda = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['M'])
}

data class Pedido(val numero: Int, val valor: Double)