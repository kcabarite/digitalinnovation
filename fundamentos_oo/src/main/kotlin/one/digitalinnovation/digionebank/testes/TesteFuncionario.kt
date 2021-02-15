package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val kleber = Pessoa(name ="Kleber Cabarite", cpf = "123456789")
    println(kleber.name)
    println(kleber.cpf)

    val joao = Funcionario("Joao carlos", cpf = "102928393938", BigDecimal.valueOf(2000))
    println(joao.name)
    println(joao.cpf)
    println(joao.salario)
}