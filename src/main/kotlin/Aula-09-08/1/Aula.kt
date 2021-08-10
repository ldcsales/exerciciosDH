package `Aula-09-08`.`1`

import java.sql.Date
import java.sql.Time

class Aula(var materia: Materia, var horarioInicio: String, var horarioTermino: String) {

    var listaPresentes = mutableListOf<Aluno>()


    fun adicionarAlunoPresente(aluno: Aluno) {
        //: MutableList<Aluno>
        listaPresentes.add(aluno)
        //return listaPresentes
    }

    fun imprimirAlunosPresentes() {
        var cont = 0
        for (cont in listaPresentes.indices) {
            println("RA: ${listaPresentes[cont].ra} Nome: ${listaPresentes[cont].nome} ${listaPresentes[cont].sobrenome}")
        }
    }

    fun gerarListaPresenca(listaAlunos: MutableList<Aluno>): MutableList<Int> {
        var listaPresenca = mutableListOf<Int>()
        var cont = 0
        var cont2 = 0
        //professor.fazerChamada()
        //println("Index -> ${listaPresentes.lastIndex}")
        for (cont in listaAlunos.indices) {
            //println("Iniciou loop 1 cont= $cont")
            //loop@
            for (cont2 in listaPresentes.indices) {
                //println("Iniciou loop 2 cont2= $cont2")
                if ((listaAlunos[cont].ra) == (listaPresentes[cont2].ra)) {
                    //println("adicionou 1")
                    listaPresenca.add(1)
                    break
                    //println(listaPresenca[cont])
                    //break@loop


                } else if (cont2 == listaPresentes.lastIndex) {
                    //println("adicionou 0")
                    listaPresenca.add(0)
                }
                /*else if((listaAlunos[cont].ra) != (listaPresentes[cont2].ra)) {
                       println("adicionou 0")
                       listaPresenca.add(0)
                       println(listaPresenca[cont])
                       break@loop
                   }*/

            }
        }
        println(listaPresenca)
        return listaPresenca
    }
}

