package Cinema

import java.util.Scanner

fun main() {

    var ingressoPadrao = IngressoPadrao(40.0)
    var ingressoVip = IngressoVip(20.0,ingressoPadrao.valor)

    val scanner = Scanner(System.`in`)
    do {

        println("Ola, qual ingresso gostaria de comprar?")
        println(
            """
        1 - Ingresso Padrao
        2 - Ingresso Vip
        3 - Sair
    """.trimIndent()
        )
        println("Cleann")
        var resposta = scanner.nextInt()

        if (resposta == 1) {
            ingressoPadrao.imprimeValor()
        } else if (resposta == 2) {
            ingressoVip.imprimeValor()
        } else if(resposta == 3) {
            println("Obrigado, ate a proxima\n")
        } else{
            println("Opcao incorreta, digite novamente.\n")
        }

    }while(resposta != 3)


}