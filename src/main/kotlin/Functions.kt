/*fun main(){
    print(umMaisUm())
}

fun umMaisUm() : Int{
    return 1+1
}*/

fun main(){
    println("Hello World!")
    println(soma(5,10))
    println("\nExercicio 1\n" + analisarTresNumeros(4,5,2))
    println("\nExercicio 2\n" + analisarDuasStrings("Oi","Oi"))
    println("\nExercicio 3\n" + analisarPar(5))
}

fun soma(numero1: Int,numero2: Int) : Int{
    return numero1 + numero2
}

/*
Exercicios casa
https://kotlinlang.org/docs/basic-syntax.html
*/

//1) Escrever o código que deve analisar três números inteiros e retornar o maiordeles. ------------- OK

fun analisarTresNumeros(numeroUm: Int,numeroDois: Int,numeroTres: Int): Int {
    if(numeroUm>=numeroDois && numeroUm>=numeroTres) {
        return numeroUm
    }else{
        if(numeroDois>=numeroTres){
            return numeroDois
        }
        else{
            return numeroTres
        }
    }
}
//2) Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false. ------------- OK

fun analisarDuasStrings(stringUm : String, stringDois: String) : Boolean{
    if (stringUm == stringDois){
        return true
    }
    else{
        return false
    }
}

//3) Escrever o código que deve analisar um número inteiro e, caso ele seja par,retornar true, caso contrário, retorna false.

fun analisarPar(numero: Int): Boolean{
    if(numero % 2 == 0){
        return true
    }
    else{
        return false
    }
}

//4) Escrever um programa que imprima na tela os primeiros 100 númerosinteiros positivos ímpares.
//5) Escrever um código que deve analisar quatro números inteiros e, caso numAseja maior que numC e numD ou caso numB seja maior que numC e numD,retornar true, caso contrário, retornar false.
//6) Escrever um programa que exiba os primeiros 100 números positivos.




