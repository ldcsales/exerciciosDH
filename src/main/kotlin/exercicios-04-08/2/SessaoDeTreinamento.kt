package `exercicios-04-08`.`2`

class SessaoDeTreinamento(var experiencia: Int) {

    fun treinarA(jogador: JogadorDeFutebol){

        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("Experiencia inicial: $experiencia")
        experiencia ++
        println("Experiencia final: $experiencia")

    }

}