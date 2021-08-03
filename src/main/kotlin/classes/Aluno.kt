package classes

class Aluno(var nome: String , var idade: Int) {

    var curso: String = "x"
    var matricula: String = "y"

    constructor(nome: String, idade: Int, curso:String) : this(nome,idade){
        this.curso = curso
    }

    constructor(nome: String, idade: Int, curso:String, matricula:String ) : this(nome,idade,curso){
        this.matricula = matricula
    }


}