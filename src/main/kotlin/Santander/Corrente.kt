package Santander

class Corrente(var chequeEspecial: Int, saldo: Double, cliente: Cliente) : Conta(saldo, cliente) {

    fun depositarCheque(cheque)

}