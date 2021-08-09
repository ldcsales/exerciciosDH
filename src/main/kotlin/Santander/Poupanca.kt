package Santander

class Poupanca(var taxaJuros: Double, saldo: Double, cliente: Cliente, ): Conta(saldo, cliente) {

    fun recolherJuros(): Double {
        return saldo * taxaJuros
    }

}