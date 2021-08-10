package `Aula-09-08`.`1`

import java.sql.Date
import java.sql.Time

class Aula(materia: Materia, var horarioInicio : String, var horarioTermino: String) {

    var listaPresentes = mutableListOf<Aluno>()


    fun adicionarAlunoPresente(aluno: Aluno) : List<Aluno>{
        listaPresentes.add(aluno)
        return listaPresentes
    }
}

