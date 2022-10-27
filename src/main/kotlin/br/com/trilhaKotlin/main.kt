fun main() {
    val pedidos = mutableMapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido: $it")
    }
    for (p in pedidos){
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