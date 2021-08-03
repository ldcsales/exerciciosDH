package classes

class Multiplicar(var lista: List<Int> ) {
    fun multiplicaArray() : Int{
        var i = 0
        var resultado = lista[i]
        while(i<lista.size){
            resultado = resultado * lista[i];
            i++
        }
        println(resultado)
        return resultado
    }
    fun printarResultado(){
        println(multiplicaArray())
    }
}