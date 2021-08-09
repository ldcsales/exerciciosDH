package Santander

class Corrente(var chequeEspecial: Int, saldo: Double, cliente: Cliente) : Conta(saldo, cliente) {

    fun depositarCheque(cheque: Cheque): Boolean{
        saldo += cheque.valor
        println(imprimirSaldo())
        return true
    }

}