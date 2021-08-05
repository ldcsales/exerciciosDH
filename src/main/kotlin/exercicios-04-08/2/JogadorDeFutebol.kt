package `exercicios-04-08`.`2`

class JogadorDeFutebol(var nome : String , var energia : Int, var alegria  : Int, var gols: Int, experiencia : Int) {

    public fun fazerGol(){
        energia = energia - 5
        alegria = alegria + 10
        gols = gols + 1
        println("GOOOOOOL")
    }

    public fun correr(){
        energia = energia - 10
    }


}