package Santander

open class Conta(var saldo: Double, var cliente: Cliente) {

    open fun deposito(valor : Double){
        saldo += valor
        println(imprimirSaldo())
    }

    open fun imprimirSaldo() : String{
        //println("Saldo Atual: $saldo")
        return "Saldo Atual: $saldo"
    }

    open fun saque(valor : Double){

        if(saldo >= valor){
            saldo -= valor
            println("Transacao Realizada\n${imprimirSaldo()}")

        }else{
            println("Saldo Insuficiente")
        }

    }

}