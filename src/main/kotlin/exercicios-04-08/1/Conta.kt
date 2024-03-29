package `exercicios-04-08`.`1`

/*
2. Definir uma nova classe Conta contendo as seguintes propriedades:
- número da conta
- saldo
- titular (o titular é um objeto do tipo Cliente).
 */

class Conta(var numero: Int, var saldo: Double, var titular: Cliente) {

    fun deposito(valor : Double){
        saldo += valor
        println(imprimirSaldo())
    }

    fun imprimirSaldo() : String{
        //println("Saldo Atual: $saldo")
        return "Saldo Atual: $saldo"
    }

    fun saque(valor : Double){

        if(saldo >= valor){
            saldo -= valor
            println("Transacao Realizada\n${imprimirSaldo()}")

        }else{
            println("Saldo Insuficiente")
        }

    }

}