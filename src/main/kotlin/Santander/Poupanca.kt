package Santander

class Poupanca(var saldoPoupanca: Double, var taxaJuros: Double, saldo: Double, cliente: Cliente, ): Conta(saldo, cliente) {

    fun recolherJuros(): Double {
        return saldoPoupanca * this.taxaJuros
    }

    override fun deposito(valor : Double){
        saldoPoupanca += valor
        println(imprimirSaldo())
    }

    override fun imprimirSaldo() : String{
        //println("Saldo Atual: $saldo")
        return "Saldo Atual Poupanca: $saldoPoupanca"
    }

}