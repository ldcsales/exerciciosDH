package `Aula-18-08`.`2`

class Coca(
    var tamanho: Int,
    var preco: Double
) {

    override fun equals(other: Any?): Boolean {
        return (other is Coca && other.tamanho == this.tamanho)
    }

    override fun hashCode(): Int {
        return tamanho
    }

    override fun toString(): String {
        return "$tamanho $preco"
    }
}