package classes

fun main(){

    val aluno = Aluno("Lucas Sales", 27)

    println(aluno.nome + " " + aluno.idade + " " + aluno.curso + " " + aluno.matricula)

    //teste da classe Aposentado
    val aposentado = Aposentado(65,'m',30).printarAposentadoria()
    val multiplicar = Multiplicar(listOf(1,2,3,4)).printarResultado()
}