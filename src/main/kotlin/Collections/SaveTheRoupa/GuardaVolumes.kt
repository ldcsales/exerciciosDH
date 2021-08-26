package Collections.SaveTheRoupa

class GuardaVolumes {

    var dicionario = mutableMapOf<Int, MutableList<Peca>>()
    var contador: Int = 0


    fun guardarPecas(lista: MutableList<Peca>): Int {
        this.contador++
        //dicionario = mutableMapOf<Int, MutableList<Peca>>(contador to lista)
        dicionario.put(contador, lista)
        return contador
    }

    fun mostrarPecas() {
        for ((chave, valor) in dicionario) {
            for (cont in valor)
                println("Chave: ${chave} Item: ${cont.marca} ${cont.modelo}")
        }
        println("\n")
    }

    fun devolverPecas(numero: Int) {
        dicionario.remove(numero)
        //contador=numero

    }

}