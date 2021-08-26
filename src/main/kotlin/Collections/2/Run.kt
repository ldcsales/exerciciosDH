package Collections.`2`

fun main() {

    var dici = Dicionario()
    dici.dicionario = mapOf<String,List<String>>(
        "Joao" to listOf<String>("Juan","El Divo","Maromba","Ze Bonitinho"),
        "Miguel" to listOf("Dark Knight", "Bruce Wayne", "Batfleck","Gengiva"),
        "Maria" to listOf("Ju","Mary","Marilene","Ventania"),
        "Lucas" to listOf("Lukinha", "Jorge", "George", "Kevin Flynn")
    )


    dici.printLista(dici.dicionario)



}