package Collections.SaveTheRoupa

class GuardaVolumes {

    var dicionario = mutableMapOf<Int,MutableList<Peca>>()
    var contador = 0

    fun guardarPecas(lista: MutableList<Peca>): Int{
        contador++
        //println(lista[0].marca)
        dicionario = mutableMapOf<Int,MutableList<Peca>>(contador to lista)
        //println(dicionario)
        return contador
    }

    fun mostrarPecas(){
        for((chave,valor) in dicionario){
            for(cont in valor)
            println("Chave: ${chave} Item: ${cont.marca} ${cont.modelo}")
        }
    }

    fun devolverPecas(numero: Int){
        dicionario.remove(numero)
    }

}