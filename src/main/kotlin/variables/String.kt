package variables

fun main(){

    /**
     * Tipo tring:
     */

    val s1 = "abc"
    val s2 = "def"

//    val s1s2 = "Soma: " + s1 + s2
    val s1s2 = "Soma: $s1$s2 . O tamanho é: ${(s1+s2).length}"  //String template

    println(s1s2)
}