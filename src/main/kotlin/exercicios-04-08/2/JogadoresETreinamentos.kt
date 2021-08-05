package `exercicios-04-08`.`2`

fun main() {
    var jogador1 = JogadorDeFutebol("Lucas",50,50,50,50)
    var jogador2 = JogadorDeFutebol("Joao",100,100,100,100)
    //var sessao = SessaoDeTreinamento(experiencia = jogador1.)
    //var sessao =
    SessaoDeTreinamento(jogador1.experiencia).treinarA(jogador1)
    //println("teste")
    println("${jogador1.nome} \n ${jogador1.energia} \n ${jogador1.alegria} \n ${jogador1.gols} \n ${jogador1.experiencia}")
    SessaoDeTreinamento(jogador1.experiencia).treinarA(jogador1)
    println("${jogador1.nome} \n ${jogador1.energia} \n ${jogador1.alegria} \n ${jogador1.gols} \n ${jogador1.experiencia}")



}

