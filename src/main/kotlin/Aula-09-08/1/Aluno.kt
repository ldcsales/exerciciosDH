package `Aula-09-08`.`1`

class Aluno(var ra: Int, var nome: String, var sobrenome: String) {

    fun assistirAula(): Boolean{
        println("Aula assistida")

        return true

    }

    fun fazerLicao(): Boolean{
        println("Licao Feita")
        return true
    }
}