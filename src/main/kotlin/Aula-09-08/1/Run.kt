package `Aula-09-08`.`1`

fun main() {

    //var listateste = mutableListOf<Int>(1,2,3)


    var professor1 = Professor("Marta",202101)
    var aluno1 = Aluno(202101,"Lucas","Sales")
    var aluno2 = Aluno(202102,"Jose","Silva")
    var aluno3 = Aluno(202103,"Maria","Souza")

    var materia = Materia("Historia")
    var curso = Curso("Analise Sistemas", professor1)
    var aula = Aula(materia,"08:30","10:30")
    var turma = Turma("TI01",curso)

    aluno1.assistirAula(aula,aluno1)
    aluno2.assistirAula(aula,aluno2)
    //aluno3.assistirAula(aula,aluno3)

    aluno1.fazerLicao()
    professor1.darAula(aula)

    println(professor1.fazerChamada(curso.listaAlunos,aula))
    //println(listateste)
    //aluno1.assistirAula(aula,aluno1)
    //assistirAula(aula,aluno1)


}