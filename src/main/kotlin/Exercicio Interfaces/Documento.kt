package `Exercicio Interfaces`

class Documento(
    override var nome: String,
    override var tipoDocumento: String
) : Imprimivel {

    override fun imprimir() {
        println("Eu sou ${tipoDocumento}, ${nome}")
    }
}