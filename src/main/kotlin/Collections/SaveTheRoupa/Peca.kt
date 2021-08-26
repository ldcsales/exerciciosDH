package Collections.SaveTheRoupa

/*
Criar a classePeça, que contenha as variáveis
marca e modelo,
ambas de tipo String e um
método abstrato chamado retirada.
 */
abstract class Peca(
    marca: String = "",
    modelo: String = "",
) {

    abstract fun retirada()
}
