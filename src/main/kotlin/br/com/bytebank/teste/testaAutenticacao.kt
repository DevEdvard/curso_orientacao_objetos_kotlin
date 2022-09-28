import br.com.bytebank.model.Cliente
import br.com.bytebank.model.Gerente
import br.com.bytebank.model.SistemaInterno

fun testaAutenticacao() {
    val eduardo = Gerente(
        "Eduardo",
        "111.111.111-11",
        1000.0,
        1000
    )

    val cliente = Cliente("", "", 1)

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(eduardo, 1000)
    sistemaInterno.entra(cliente, 1)
}