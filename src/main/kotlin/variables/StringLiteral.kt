package variables

fun main(){

    /**
     * Strings literais
     */

    /**
     * O rato roeu
     * a roupa do
     * rei de "Roma".
     */

    val s1 = "O rato roeu\na \$roupa do\nrei de \"Roma\"."
    println(s1)

    val s2 = """
       |O rato roeu
       | a roupa do
       |rei de "Roma".
    """.trimMargin() //quebra as linhas a partir das pipes
        .trimIndent()  //quebra todos os caracteres vazios da primeira linha, e quebra a mesma quantidade para as demais linhas
    println(s2)

}