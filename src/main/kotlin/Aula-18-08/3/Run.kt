package `Aula-18-08`.`3`

fun main() {
    var pessoa1 = Pessoa("Lucas", 123)
    var pessoa2 = Pessoa("Lucas", 123)

    println(pessoa1.toString())
    println(pessoa1.hashCode())

    println(pessoa1.equals(pessoa2))
}