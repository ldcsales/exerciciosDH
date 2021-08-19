package `Aula-18-08`.`1`

fun main() {
    var pessoa1 = Pessoa("Lucas",123)
    var pessoa2 = Pessoa("Marcio",123)

    if(pessoa1 == pessoa2){
        println("True")
    }else{
        println("False")
    }
//nao e necessario chamar o toString()
    println(pessoa1.toString())
    println(pessoa1.hashCode())




}