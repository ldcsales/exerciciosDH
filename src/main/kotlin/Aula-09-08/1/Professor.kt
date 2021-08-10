package `Aula-09-08`.`1`

class Professor(var nome: String, var rd: Int) {


    fun darAula(aula: Aula): Boolean {
        println("Aula realizada.")
        return true
    }

    fun fazerChamada(aula: Aula, listaAlunos: MutableList<Aluno>) {
        println("Iniciando Chamada")
        aula.gerarListaPresenca(listaAlunos)
        println("Chamada Finalizada")
    }

    /*fun fazerChamada(listaAlunos: MutableList<Aluno>, aula: Aula): MutableList<Int> {
        var listaPresenca = mutableListOf<Int>()
        var cont : Int = 0
        var cont2 : Int = 0
        println(aula.listaPresentes[0].ra)
        println(listaAlunos.indices)
       /* for (cont in listaAlunos.indices) {
            println("1o for")
            for (cont2 in aula.listaPresentes.indices) {
                if ((listaAlunos[cont].ra) == (aula.listaPresentes[cont2].ra)) {
                    println("OK")
                    listaPresenca.add(1)
                    break
                }else((listaAlunos[cont].ra) != (aula.listaPresentes[cont2].ra))
                listaPresenca.add(0)
            }

        }*/
        for (cont in listaAlunos.indices) {
            //println("OK")
            if ((listaAlunos[cont].ra) == (aula.listaPresentes[cont].ra)) {
                println("adicionou 1")
                listaPresenca.add(1)
                println(listaPresenca[cont])

            }else if((listaAlunos[cont].ra) != (aula.listaPresentes[cont].ra)) {
                println("adicionou 0")
                listaPresenca.add(0)
                println(listaPresenca[cont])
            }

        }

        //println(listaPresenca)
        return listaPresenca
    }*/


}




