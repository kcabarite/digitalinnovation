package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose Carlos",
        cpf = "129202833",
        clienteTipo = ClienteTipo.PF,
        senha = "123"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}