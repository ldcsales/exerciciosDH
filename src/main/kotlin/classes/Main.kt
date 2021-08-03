package classes

fun main(){

    val aluno = Aluno("Lucas Sales", 27)

    println(aluno.nome + " " + aluno.idade + " " + aluno.curso + " " + aluno.matricula)


    val aposentado = Aposentado(65,'M',30).printarAposentadoria()

}