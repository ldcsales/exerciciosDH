package `Aula-09-08`.`1`

class Professor(var nome: String, var rd: Int) {



    fun darAula(aula: Aula): Boolean {
        println("Aula realizada.")
        return true
    }

    fun fazerChamada(listaAlunos: List<Aluno>, aula: Aula): List<Int> {
        var listaPresenca = mutableListOf<Int>()
        var cont : Int = 0
        var cont2 : Int = 0
        for (cont in listaAlunos.indices) {
            for (cont2 in aula.listaPresentes.indices) {
                if ((listaAlunos[cont].ra) == (aula.listaPresentes[cont2].ra)) {
                    listaPresenca.add(1)
                    break
                }

            }
            listaPresenca.add(0)
        }

        return listaPresenca
    }


}



}
