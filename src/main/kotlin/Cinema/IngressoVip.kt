package Cinema

class IngressoVip(var valorAdicional : Double, valor: Double) : Ingresso(valor) {

    override fun imprimeValor() {
        println("Ingresso VIP ${(valor + valorAdicional)}")
    }

}