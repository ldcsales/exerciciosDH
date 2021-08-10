package `Aula-09-08`.`1`

import java.sql.Date
import java.sql.Time

class Aula(var materia: Materia, var horarioInicio : String, var horarioTermino: String) {

    var listaPresentes = mutableListOf<Aluno>()


    fun adicionarAlunoPresente(aluno: Aluno) {
        //: MutableList<Aluno>
        listaPresentes.add(aluno)
        //return listaPresentes
    }

    fun imprimirAlunosPresentes(){
        var cont =0
        for(cont in listaPresentes.indices){
            println("RA: ${listaPresentes[cont].ra} Nome: ${listaPresentes[cont].nome} ${listaPresentes[cont].sobrenome}")
        }
    }
}

