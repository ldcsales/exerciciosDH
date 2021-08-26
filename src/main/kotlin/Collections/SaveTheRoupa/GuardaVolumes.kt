package Collections.SaveTheRoupa

class GuardaVolumes {

    var dicionario = mutableMapOf<Int,MutableList<Peca>>()
    var contador = 0

    fun guardarPecas(lista: MutableList<Peca>): Int{
        contador++
        dicionario = mutableMapOf<Int,MutableList<Peca>>(contador to lista)
        return contador
    }

}