package Cinema

import java.util.Scanner

fun main() {

    var ingressoPadrao = IngressoPadrao(40.0)
    var ingressoVip = IngressoVip(20.0,ingressoPadrao.valor)

    val scanner = Scanner(System.`in`)

    //opcao do while
    do {

        println("Ola, qual ingresso gostaria de comprar?")
        println(
            """
        1 - Ingresso Padrao
        2 - Ingresso Vip
        3 - Sair
    """.trimIndent()
        )
        //println("Cleann")
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

    // OPCAO COM CASE

    println("Ola, qual ingresso gostaria de comprar?")
    println(
        """
        1 - Ingresso Padrao
        2 - Ingresso Vip
        3 - Sair
    """.trimIndent()
    )
    when(scanner.nextInt()){
        1 -> ingressoPadrao.imprimeValor()
        2 -> ingressoVip.imprimeValor()
        3 -> println("Obrigado, ate a proxima")
        else -> println("Opcao invalida, digite novamente")
    }

}