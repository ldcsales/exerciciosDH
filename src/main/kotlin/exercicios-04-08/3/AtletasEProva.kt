package `exercicios-04-08`.`3`

fun main() {

    var atleta1 = Atleta("Lucas",7,10)
    var atleta2 = Atleta("Marco",5,8)

    var prova1 = Prova(5,9)
    var prova2 = Prova(10,11)
    var prova3 = Prova(5,5)

    //var resultado1 = prova1.podeRealizar(atleta1)
    //var resultado2 = prova2.podeRealizar(atleta1)
    //var resultado3 = prova3.podeRealizar(atleta1)

    if(prova1.podeRealizar(atleta1)){
        println("Atleta ${atleta1.nome} pode realizar prova 1")
    }else{
        println("Atleta ${atleta1.nome} nao pode realizar prova 1")
    }

    if(prova2.podeRealizar(atleta1)){
        println("Atleta ${atleta1.nome} pode realizar prova 2")
    }else{
        println("Atleta ${atleta1.nome} nao pode realizar prova 2")
    }

    if(prova3.podeRealizar(atleta1)){
        println("Atleta ${atleta1.nome} pode realizar prova 3")
    }else{
        println("Atleta ${atleta1.nome} nao pode realizar prova 3")
    }

    if(prova1.podeRealizar(atleta2)){
        println("Atleta ${atleta2.nome} pode realizar prova 1")
    }else{
        println("Atleta ${atleta2.nome} nao pode realizar prova 1")
    }

    if(prova2.podeRealizar(atleta2)){
        println("Atleta ${atleta2.nome} pode realizar prova 2")
    }else{
        println("Atleta ${atleta2.nome} nao pode realizar prova 2")
    }

    if(prova3.podeRealizar(atleta2)){
        println("Atleta ${atleta2.nome} pode realizar prova 3")
    }else{
        println("Atleta ${atleta2.nome} nao pode realizar prova 3")
    }

}