package br.com.trilhaKotlin.colecoes.parte2.teste

fun testaComportamentosMap() {
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )
//    println(pedidos.getValue(5))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)
    println(pedidos.values)

    for (numero in pedidos.values) {
        println("Pedido $numero")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    println(pedidos + Pair(7, 90.0))
    println(pedidos - 6)
    println(pedidos)

    pedidos += (setOf(7 to 90.0, 8 to 20.0, 8 to 30.0))
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido: $it")
    }
    for (p in pedidos) {
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }

    pedidos[4] = 70.0
    pedidos.put(5, 80.0)
    pedidos.put(1, 100.0)
    pedidos.putIfAbsent(6, 200.0)
    pedidos.putIfAbsent(6, 300.0)
    pedidos.remove(4)
    pedidos.remove(3, 100.0)
    pedidos.remove(2, 34.0)
    println(pedidos)
}