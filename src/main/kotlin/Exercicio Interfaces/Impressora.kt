package `Exercicio Interfaces`

class Impressora() {
    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionarImprimivel(imprimivel: Imprimivel) {
        listaImprimivel.add(imprimivel)
    }

    fun imprimirLista() {
        var cont = 0
        for (cont in listaImprimivel.indices) {
            println(
                """
                Nome: ${listaImprimivel[cont].nome}
                Tipo Documento:${listaImprimivel[cont].tipoDocumento}
                
            """.trimIndent()
            )
            //println("Nome: ${listaImprimivel[cont].nome}\nTipo Documento:")
        }
    }


}