package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val joao = Analista("Joao Pedro", "12345677", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}



