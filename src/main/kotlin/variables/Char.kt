package variables

fun main(){

    /**
     * Tipo Char
     *
     */
    val c: Char = 'A'
    println(c)
    println(c.code)
    val i = 65
    println(i.toChar())

    val c2 = '1'
    val c3 = 'a'

    println(c2.isDigit())
    println(c2.isLetter())
    println(c3.isUpperCase())
    println(c2.digitToInt())

    println(c2.inc().inc())  //incrementa os numeros
    println(c.inc().inc()) //incrementa o char na sequencia do alfabeto
}