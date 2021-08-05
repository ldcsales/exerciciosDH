package `exercicios-04-08`.`3`

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {

    fun podeRealizar(atleta : Atleta) {

        if((atleta.nivel >= dificuldade) && atleta.energia >= energiaNecessaria){
            true
        }else{
            false
        }
    }



}