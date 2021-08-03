package classes

/*
Escreva uma classe que receba uma lista de números
e uma função que imprime no console o produto
ou seja o resultado de multiplicar todos os elementos entre si.
Por exemplo: array[1, 4, 7] deve imprimir 28, que é 1 * 4 * 7.
 */

class Multiplicar(var lista: List<Int> ) {

    //Multiplica os nmumeros do array

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

    //Funcao printar o resultado da funcao multiplicaArray

    fun printarResultado(){
        println(multiplicaArray())
    }
}