package `exercicios-04-08`.`1`

fun main() {
    var cliente1 = Cliente("Lucas", "Sales")
    var cliente2 = Cliente("Marco", "Aurelio")

    var conta1 = Conta(1 ,1500.00, cliente1)
    var conta2 = Conta(2,2500.00, cliente2)

    conta1.deposito(200.00)
    conta2.deposito(200.00)
    conta1.saque(100.00)
    conta2.saque(100.00)

    println("Nome: ${cliente1.nome} \nSobrenome: ${cliente1.sobrenome} \nNumero: ${conta1.numero} \nSaldo: ${conta1.saldo}")
    println("Nome: ${cliente2.nome} \nSobrenome: ${cliente2.sobrenome} \nNumero: ${conta2.numero} \nSaldo: ${conta2.saldo}")
}