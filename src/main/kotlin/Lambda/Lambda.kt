package Lambda

fun main() {
    println(soma(5, 5))
    println(subtracao(5, 5))
    println(divisao(10, 5))
    println(multiplicacao(5, 5))
    println(validaEmail("lucas.goluol.com.br"))
    println(produtoLista(listOf(1, 2, 2, 2, 2, 2)))
    println(produtoLista(listOf()))
}

/*
 Crie 4  funções lambdas para as operações de matemáticabásica:
 soma,subtração, multiplicação e divisão.
 Cada lambda receberá2 parâmetros pararealizar as operações.
 Crie uma função Main e execute-as, printando os resultados.
 */

val soma: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
val subtracao: (Int, Int) -> Int = { a: Int, b: Int -> a - b }
val divisao: (Int, Int) -> Int = { a: Int, b: Int -> a / b }
val multiplicacao: (Int, Int) -> Int = { a: Int, b: Int -> a * b }


/*
Crie uma função lambda que receba um e-mail evalide-o para saber
se estáconforme as regras básicas.
Para cumprir a regra básicaprincipal, o mesmo deveconter um @.
OBS. essa função deve retornar true oufalse, ok? =)
Execute-o na função Main, printando o resultado.
 */

val validaEmail: (String) -> Boolean = {
    (it.contains("@"))
}

/*
Cria uma função lambda que receba uma List<Int>e
calcule e retorne oproduto dos itens contidos na mesma.
Execute-o na função Main, printando o resultado.
 */

val produtoLista: (List<Int>) -> Int = {
    var produto: Int = 1
    //println(i)
    if (it.isEmpty()) {
        produto = 0
    } else {
        for (i in it) {
            produto *= i
        }
    }
    produto

}

/*
//Exemplo simples, retornando UNIT
valsoma={a:Int, b:Int->println(a + b)}
//Exemplo simples retornando valor, não mais UNIT
valsomaComRetorno: (Int,Int) ->Int={a:Int, b:Int->a + b}
//Exemplo mais detalhado em relacao aos parametrose retorno UNIT
valsomaDeOutraFormaEPrinta: (Int,Int) ->Unit={a:Int, b:Int->println(a + b)}
//Exemplo mais detalhado em relacao aos parametrosporémsimplificado após chave e retorno UNIT
valsomaDeOutraFormaEPrintaSimplificado: (Int,Int)->Unit={a, b->println(a + b)}
//Exemplo com retorno de String
valsomaDeOutraFormaERetornaString: (Int,Int) ->String={a:Int, b:Int->valresultado= a + b"$resultado"}
//Exemplo com um unico parametro, para usar o IT
valsomaComUmUnicoParametro: (Int) ->Int={it+10}
//Exemplo recebendo list como parametro e printnadoapenas osnúmeros pares
vallistaFiltrada: (List<Int>) ->Unit= {for(iteminit){if(item%2==0){println(item)}}}
 */