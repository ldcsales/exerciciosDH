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
}