package `Aula-09-08`.`1`

class Professor(var nome: String, var rd: Int) {

    fun darAula(aula: Aula): Boolean{
        println("Aula realizada.")
        return true
    }

    fun fazerChamada(listaAlunos: List<Aluno>, aula: Aula): List<Int>{
        var listaPresenca = mutableListOf<Int>()
        var cont = 0
        var cont2 = 0
        for(cont in listaAlunos){
            for (cont2 in aula.listaPresentes){
                if(listaAlunos[cont] == aula.listaPresentes[cont2]){
                    listaPresenca.add(listaAlunos[cont])
                }
            }

        }

        return listaPresenca
    }


}