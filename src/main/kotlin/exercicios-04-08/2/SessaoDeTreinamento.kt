package `exercicios-04-08`.`2`

class SessaoDeTreinamento(var experiencia: Int) {

    public fun treinarA(jogador: JogadorDeFutebol){

        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("Experiencia inicial: ${jogador.experiencia}")
        jogador.experiencia ++
        println("Experiencia final: ${jogador.experiencia}")

    }

}