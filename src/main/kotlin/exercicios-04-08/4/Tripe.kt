package `exercicios-04-08`.`4`

class Tripe(var dobrado : Boolean, var alturaMinima : Int , var alturaMaxima : Int, var alturaAtual : Int) {

    fun definirAltura(novaAltura: Int){
        alturaAtual = novaAltura
    }

    fun dobrar(){
        dobrado = true
    }
    fun desdobrar(){
        dobrado = false
    }
    fun guardar(){
        dobrar()
        alturaAtual = alturaMinima
    }
    fun prontoParaGuardar() {
        if(dobrado && alturaAtual == alturaMinima){
            true
        }
    }
    fun usar() {
        if(prontoParaUsar() == true){
            true
        }
    }
    fun prontoParaUsar(): Boolean {
        if (alturaAtual == (alturaMaxima / 2) && dobrado == false) {
           return true
        } else {
            return false
        }

    }



}