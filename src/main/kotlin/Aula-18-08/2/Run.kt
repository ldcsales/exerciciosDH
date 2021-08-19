package `Aula-18-08`.`2`

fun main() {
    var coca1 = Coca(1, 1.00)
    var coca2 = Coca(1, 5.00)

    if (coca1 == coca2) {
        println("True")
    } else {
        println("False")
    }
//nao e necessario chamar o toString()
    println(coca1.toString())
    println(coca1.hashCode())

    println(coca1.equals(coca2))


}