package Cinema

class IngressoPadrao(valor: Double): Ingresso(valor) {

    override fun imprimeValor() {
        println("Ingresso Padrao: ${valor}")
    }

}