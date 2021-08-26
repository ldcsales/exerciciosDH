package Collections

class Dicionario {

    var dicionario = mapOf<Int,String>()

    fun printarLista(lista: Map<Int,String>){
            //println(lista)
            for((chave,valor) in lista){
                println("Chave: $chave Valor: $valor")
            }
        }


}