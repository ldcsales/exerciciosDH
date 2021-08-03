package classes

/*Escreva uma classe que receba como parâmetro uma
idade,
um sexo e
os anos   de   contribuição   para   a   aposentadoria
e
desenvolva   uma   função   que imprime no console verdadeiro ou falso.
Lembrando que: - A idade mínima para mulheres é de 60 anos; -
A idade mínima para homens é de 65 anos; -
Em ambos os casos as pessoas devem ter pelo menos 30 anos de contribuição.

 */

class Aposentado(var idade: Int, var sexo: Char,var anosContribuicao: Int) {

    //sexo = sexo.toUpperCase()


    fun aposentadoria(): Boolean {
        if ((sexo == 'm') || (sexo == 'M')) {
            if ((idade >= 65) && (anosContribuicao >= 30)) {
                return true
            }
        } else if ((sexo == 'f') || (sexo == 'F')) {
            if ((idade >= 60) && (anosContribuicao >= 30)) {
                return true
            }
        }
        return false
    }
    fun printarAposentadoria(){
        if(aposentadoria()){
            println("Pode Aposentar")
        }else{
            println("Nao pode aposentar")
        }
    }
}



