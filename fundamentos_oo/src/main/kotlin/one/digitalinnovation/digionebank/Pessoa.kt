package one.digitalinnovation.digionebank

// Classe Pessoa
class Pessoa {
    var nome: String = "Kleber"

    var cpf: String = "310.555.398-32"
    private set // private set nao permite que mexa em qualquer lugar no projeto

    constructor()

    fun personInfo() = "$nome = $cpf"

// Criando uma classe dentro da outra (inner class)
//    inner class endereco {
//        var rua: String = "Rua teste"

 //   }
}
    fun main(){
        val kleber = Pessoa()

     //   println(kleber)
        println(kleber.personInfo())
        //println(kleber.nome)
        // println(kleber.cpf)

//        println(kleber.endereco().rua)

        }

