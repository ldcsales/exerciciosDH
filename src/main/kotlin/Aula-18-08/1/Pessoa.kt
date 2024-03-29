package `Aula-18-08`.`1`

import classes.Aluno

class Pessoa(
    var nome: String,
    var rg: Int
) {

    override fun equals(other: Any?): Boolean {
        return (other is Pessoa && other.rg == this.rg)
    }

    override fun hashCode(): Int {
        return rg
    }

    override fun toString(): String {
        return "$nome $rg"
    }


}