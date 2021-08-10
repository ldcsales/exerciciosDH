package `Aula-09-08`.`1`

class Curso(var nome: String, professor: Professor) {

    var listaAulas = mutableListOf<Aula>()
    var listaAlunos = mutableListOf<Aluno>()


    fun adicionarAula(aula: Aula){
        listaAulas.add(aula)

    }

    fun adicionarAluno(aluno: Aluno){
        listaAlunos.add(aluno)

    }

    fun imprimirAlunosCurso(){
        var cont =0
        for(cont in listaAlunos.indices){
            println("RA: ${listaAlunos[cont].ra} Nome: ${listaAlunos[cont].nome} ${listaAlunos[cont].sobrenome}")
        }
    }

    fun imprimirAulasCurso(){
        var cont =0
        for(cont in listaAulas.indices){
            println("Inicio: ${listaAulas[cont].horarioInicio} Termino: ${listaAulas[cont].horarioTermino} Materia:${listaAulas[cont].materia}")
        }
    }
}