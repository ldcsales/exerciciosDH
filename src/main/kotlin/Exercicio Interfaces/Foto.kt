package `Exercicio Interfaces`

class Foto(
    override var nome: String,
    override var tipoDocumento: String
) : Imprimivel {

    //override


    override fun imprimir() {
        println("Eu sou ${tipoDocumento}, ${nome}")
    }

}