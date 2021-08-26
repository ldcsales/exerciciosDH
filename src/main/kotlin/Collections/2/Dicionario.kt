package Collections.`2`

class Dicionario {

    var dicionario = mapOf<String,List<String>>()

    fun printLista(lista: Map<String,List<String>>){
        for((chave,valor) in lista){
            for(cont in valor){
                println("Chave: $chave Valor: $cont")
            }


        }

    }

}