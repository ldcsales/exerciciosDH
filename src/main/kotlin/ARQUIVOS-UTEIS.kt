import java.util.*

//Dicas Kotlin

/*
Black: \u001b[30m.
Red: \u001b[31m.
Green: \u001b[32m.
Yellow: \u001b[33m.
Blue: \u001b[34m.
Magenta: \u001b[35m.
Cyan: \u001b[36m.
White: \u001b[37m.

val red = "\u001b[31m"
val yellow ="\u001b[33m"
val reset = "\u001b[0m"
//ex: println(red + "teste" + reset)

-- valor para alterar println

 */
//Receber variavel do usuario
fun game() {
    val scanner = Scanner(System.`in`)
    println("Olá meu jovem, gostaria de iniciar?")
    println(
        """
        1 - sim
        2 - não
    """.trimIndent()
    )
    var retornoInicial = scanner.nextInt()

    if (retornoInicial == 1) {
        println("Boa!")
    } else {
        println("Sem tempo irmão!")
    }

}

// https://github.com/MarceloVicenteVerri/exercicios_hd/blob/main/Exercicio01/src/main/kotlin/JanelaGrafica/Menuform2.kt


fun case() {
    val scanner = Scanner(System.`in`)
    when (scanner.nextInt()) {
        1 -> println("Opcao 1, chamar algo")
        2 -> println("Opcao 2, chamar algo")
        else -> {
            println("Opcao Invalida")
        }

    }
}