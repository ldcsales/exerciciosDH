package `exercicios-04-08`.`1`

/*
2. Definir uma nova classe Conta contendo as seguintes propriedades:
- número da conta
- saldo
- titular (o titular é um objeto do tipo Cliente).
 */

class Conta(var numero: Int, var saldo: Double, var titular: Cliente) {

    fun deposito(valor : Double){
        saldo = saldo + valor
        println(imprimirSaldo())
    }

    fun imprimirSaldo(){
        println("Saldo Atual: $saldo")
    }

}